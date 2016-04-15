package com.citi.eq.tds.re.ext.db;

import com.citi.eq.tds.re.rule.core.ValuesDataSource;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mv29256 on 3/31/2016.
 */
public class H2 implements ValuesDataSource {
    private static final H2 INSTANCE = new H2();
    private Connection conn;

    private H2() {

        try {
            Class.forName("org.h2.Driver");
            conn = DriverManager.getConnection("jdbc:h2:tcp://localhost/mem:citifix", "sa", "");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            conn = null;
        }
    }

    private void close() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String[] getFor(int tag) {
        try {
            PreparedStatement statement = conn.prepareStatement("select VALUE from TAG_VALUES where tag = ?");
            statement.setInt(1, tag);
            ResultSet resultSet = statement.executeQuery();

            List<String> values = new ArrayList<>();
            while (resultSet.next()) {
                values.add(resultSet.getString(1));
            }

            return values.toArray(new String[values.size()]);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static final H2 getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) throws SQLException {
        H2 instance = H2.INSTANCE;

        String[] values = instance.getFor(1);

        for (String v : values)
            System.out.println(v);
    }
}
