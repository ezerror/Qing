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
	 * Enter a parse tree produced by {@link QingParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(QingParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link QingParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(QingParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link QingParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(QingParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link QingParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(QingParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link QingParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(QingParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link QingParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(QingParser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link QingParser#parameterName}.
	 * @param ctx the parse tree
	 */
	void enterParameterName(QingParser.ParameterNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link QingParser#parameterName}.
	 * @param ctx the parse tree
	 */
	void exitParameterName(QingParser.ParameterNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link QingParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(QingParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QingParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(QingParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QingParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(QingParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link QingParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(QingParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link QingParser#parametersList}.
	 * @param ctx the parse tree
	 */
	void enterParametersList(QingParser.ParametersListContext ctx);
	/**
	 * Exit a parse tree produced by {@link QingParser#parametersList}.
	 * @param ctx the parse tree
	 */
	void exitParametersList(QingParser.ParametersListContext ctx);
	/**
	 * Enter a parse tree produced by {@link QingParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(QingParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link QingParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(QingParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link QingParser#functionReturn}.
	 * @param ctx the parse tree
	 */
	void enterFunctionReturn(QingParser.FunctionReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link QingParser#functionReturn}.
	 * @param ctx the parse tree
	 */
	void exitFunctionReturn(QingParser.FunctionReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link QingParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionStatement(QingParser.FunctionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link QingParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionStatement(QingParser.FunctionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link QingParser#variableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationStatement(QingParser.VariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link QingParser#variableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationStatement(QingParser.VariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link QingParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(QingParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link QingParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(QingParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link QingParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(QingParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link QingParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(QingParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarReference}
	 * labeled alternative in {@link QingParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVarReference(QingParser.VarReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarReference}
	 * labeled alternative in {@link QingParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVarReference(QingParser.VarReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueExpr}
	 * labeled alternative in {@link QingParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterValueExpr(QingParser.ValueExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueExpr}
	 * labeled alternative in {@link QingParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitValueExpr(QingParser.ValueExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link QingParser#variableReference}.
	 * @param ctx the parse tree
	 */
	void enterVariableReference(QingParser.VariableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link QingParser#variableReference}.
	 * @param ctx the parse tree
	 */
	void exitVariableReference(QingParser.VariableReferenceContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link QingParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(QingParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link QingParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(QingParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link QingParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(QingParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link QingParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(QingParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link QingParser#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(QingParser.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link QingParser#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(QingParser.ClassNameContext ctx);
}