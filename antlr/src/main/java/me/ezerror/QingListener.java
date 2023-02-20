// Generated from java-escape by ANTLR 4.11.1
package me.ezerror;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link QingParser}.
 */
public interface QingListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link QingParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(QingParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link QingParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(QingParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link QingParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(QingParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link QingParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(QingParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link QingParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(QingParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link QingParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(QingParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link QingParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(QingParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link QingParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(QingParser.ValueContext ctx);
}