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
	 * Visit a parse tree produced by {@link QingParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(QingParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link QingParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(QingParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link QingParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(QingParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link QingParser#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(QingParser.ClassNameContext ctx);
}
