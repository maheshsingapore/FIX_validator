package com.resilient.re.rule.http;

import com.resilient.re.ext.Message;
import com.resilient.re.rule.core.RuleEngine;
import com.resilient.re.rule.core.StringRuleSet;
import com.resilient.re.rule.result.Result;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.server.handler.ResourceHandler;
import org.eclipse.jetty.servlet.ServletHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by mv29256 on 4/8/2016.
 */
public class HttpServer {

    public static void main(String[] args) throws Exception {
        Server jetty = new Server(8090);

        ServletHandler servlets = new ServletHandler();
        servlets.addServletWithMapping(EvalServlet.class, "/eval");

        ResourceHandler resources = new ResourceHandler();
        resources.setDirectoriesListed(true);
        resources.setWelcomeFiles(new String[]{"dsl.html"});
        resources.setResourceBase("src/main/js");

        HandlerList handlers = new HandlerList();
        handlers.addHandler(resources);
        handlers.addHandler(servlets);

        jetty.setHandler(handlers);

        jetty.start();
        jetty.join();
    }

    public static class EvalServlet extends HttpServlet {

        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            doPost(req, resp);
        }

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            Map<String, String[]> parameterMap = req.getParameterMap();
            String[] rules = parameterMap.get("rules");

            if (rules != null && rules.length > 0) {
                String[] messages = parameterMap.get("message");

                Message m = new Message(messages[0]);
                StringRuleSet rio;
                try{
                    String r = rules[0];
                    if (r != null && r.length() > 5){
                        rio = new StringRuleSet(m.getMsgType(), r);
                        RuleEngine.instance().add(rio);

                        List<String> unmatched = new ArrayList<>();
                        for (String message : messages) {
                            Result eval = RuleEngine.instance().evaluate(message);
                            if (eval.getUnmatched() != null)
                                unmatched.addAll(eval.getUnmatched());
                        }

                        resp.setContentType("text/html");
                        resp.setStatus(HttpServletResponse.SC_OK);

                        if (unmatched != null) {
                            for (String u : unmatched) {
                                resp.getWriter().println(u);
                            }
                        } else
                            resp.getWriter().println("no rule violations");
                    }
                }catch (Throwable t){
                    t.printStackTrace();
                }


            } else {
                resp.setContentType("text/html");
                resp.setStatus(HttpServletResponse.SC_OK);
                resp.getWriter().println("Please specify rules");
            }
        }
    }

}
