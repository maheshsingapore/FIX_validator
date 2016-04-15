// Generated from C:/MaheshVibhute/projects/self/kaizen/src/main/resources\FixRules.g4 by ANTLR 4.5.1
package com.citi.eq.tds.re.ext.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FixRulesParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FixRulesVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FixRulesParser#rules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRules(FixRulesParser.RulesContext ctx);
	/**
	 * Visit a parse tree produced by {@link FixRulesParser#ifRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfRule(FixRulesParser.IfRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link FixRulesParser#rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule(FixRulesParser.RuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link FixRulesParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(FixRulesParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FixRulesParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction(FixRulesParser.ActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FixRulesParser#tagStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagStmt(FixRulesParser.TagStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FixRulesParser#monoOperandOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMonoOperandOperator(FixRulesParser.MonoOperandOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FixRulesParser#monoOperand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMonoOperand(FixRulesParser.MonoOperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link FixRulesParser#tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTag(FixRulesParser.TagContext ctx);
	/**
	 * Visit a parse tree produced by {@link FixRulesParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand(FixRulesParser.OperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link FixRulesParser#biOperandOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBiOperandOperator(FixRulesParser.BiOperandOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FixRulesParser#biOperand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBiOperand(FixRulesParser.BiOperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link FixRulesParser#listOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListOperator(FixRulesParser.ListOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FixRulesParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(FixRulesParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FixRulesParser#logicalCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalCondition(FixRulesParser.LogicalConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FixRulesParser#logicalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOperator(FixRulesParser.LogicalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FixRulesParser#logicalOperand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOperand(FixRulesParser.LogicalOperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link FixRulesParser#stringOperand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringOperand(FixRulesParser.StringOperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link FixRulesParser#andOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndOr(FixRulesParser.AndOrContext ctx);
	/**
	 * Visit a parse tree produced by {@link FixRulesParser#or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(FixRulesParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by {@link FixRulesParser#and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(FixRulesParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by {@link FixRulesParser#not}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(FixRulesParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by {@link FixRulesParser#is}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIs(FixRulesParser.IsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FixRulesParser#mustBe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMustBe(FixRulesParser.MustBeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FixRulesParser#mustNotBe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMustNotBe(FixRulesParser.MustNotBeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FixRulesParser#between}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetween(FixRulesParser.BetweenContext ctx);
	/**
	 * Visit a parse tree produced by {@link FixRulesParser#equalTo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualTo(FixRulesParser.EqualToContext ctx);
	/**
	 * Visit a parse tree produced by {@link FixRulesParser#match}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatch(FixRulesParser.MatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link FixRulesParser#greaterThan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThan(FixRulesParser.GreaterThanContext ctx);
	/**
	 * Visit a parse tree produced by {@link FixRulesParser#lessThan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThan(FixRulesParser.LessThanContext ctx);
	/**
	 * Visit a parse tree produced by {@link FixRulesParser#present}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPresent(FixRulesParser.PresentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FixRulesParser#absent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsent(FixRulesParser.AbsentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FixRulesParser#alphanumeric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlphanumeric(FixRulesParser.AlphanumericContext ctx);
	/**
	 * Visit a parse tree produced by {@link FixRulesParser#mandatory}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMandatory(FixRulesParser.MandatoryContext ctx);
	/**
	 * Visit a parse tree produced by {@link FixRulesParser#valid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValid(FixRulesParser.ValidContext ctx);
	/**
	 * Visit a parse tree produced by {@link FixRulesParser#consistent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsistent(FixRulesParser.ConsistentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FixRulesParser#numeric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric(FixRulesParser.NumericContext ctx);
	/**
	 * Visit a parse tree produced by {@link FixRulesParser#before}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBefore(FixRulesParser.BeforeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FixRulesParser#after}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAfter(FixRulesParser.AfterContext ctx);
	/**
	 * Visit a parse tree produced by {@link FixRulesParser#dateToday}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateToday(FixRulesParser.DateTodayContext ctx);
	/**
	 * Visit a parse tree produced by {@link FixRulesParser#dateTomorrow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateTomorrow(FixRulesParser.DateTomorrowContext ctx);
	/**
	 * Visit a parse tree produced by {@link FixRulesParser#dateYesterday}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateYesterday(FixRulesParser.DateYesterdayContext ctx);
	/**
	 * Visit a parse tree produced by {@link FixRulesParser#date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate(FixRulesParser.DateContext ctx);
	/**
	 * Visit a parse tree produced by {@link FixRulesParser#onlyIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnlyIf(FixRulesParser.OnlyIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link FixRulesParser#openBracket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenBracket(FixRulesParser.OpenBracketContext ctx);
	/**
	 * Visit a parse tree produced by {@link FixRulesParser#closeBracket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseBracket(FixRulesParser.CloseBracketContext ctx);
}