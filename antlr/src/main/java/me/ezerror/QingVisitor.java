// Generated from java-escape by ANTLR 4.11.1
package me.ezerror;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link QingParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface QingVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link QingParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(QingParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link QingParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(QingParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link QingParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(QingParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link QingParser#functionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionName(QingParser.FunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link QingParser#parameterName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterName(QingParser.ParameterNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link QingParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(QingParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QingParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(QingParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link QingParser#parametersList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametersList(QingParser.ParametersListContext ctx);
	/**
	 * Visit a parse tree produced by {@link QingParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(QingParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link QingParser#functionReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionReturn(QingParser.FunctionReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link QingParser#functionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionStatement(QingParser.FunctionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link QingParser#variableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationStatement(QingParser.VariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link QingParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(QingParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link QingParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(QingParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link QingParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(QingParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarReference}
	 * labeled alternative in {@link QingParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarReference(QingParser.VarReferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValueExpr}
	 * labeled alternative in {@link QingParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueExpr(QingParser.ValueExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link QingParser#variableReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableReference(QingParser.VariableReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link QingParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(QingParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link QingParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(QingParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link QingParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(QingParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link QingParser#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(QingParser.ClassNameContext ctx);
}