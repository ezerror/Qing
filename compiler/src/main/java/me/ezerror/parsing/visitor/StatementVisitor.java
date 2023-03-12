package me.ezerror.parsing.visitor;

import me.ezerror.QingBaseVisitor;
import me.ezerror.QingParser;
import me.ezerror.domain.LocalVariable;
import me.ezerror.domain.inter.Expression;
import me.ezerror.domain.inter.Statement;
import me.ezerror.domain.statement.PrintStatement;
import me.ezerror.domain.statement.VariableDeclarationStatement;
import me.ezerror.parsing.scope.Scope;

/**
 * @author ：ezerror
 * @date ：Created in 2023/3/7 0:27
 */
public class StatementVisitor extends QingBaseVisitor<Statement> {


  @Override
  public Statement visitPrintStatement(QingParser.PrintStatementContext ctx) {
    PrintStatement statement = new PrintStatement();
    statement.setExpression(ctx.expression().accept(new ExpressionVisitor()));
    return statement;
  }

  @Override
  public Statement visitVariableDeclarationStatement(QingParser.VariableDeclarationStatementContext ctx) {
    String varName = ctx.name().getText();
    Expression expression = ctx.expression().accept(new ExpressionVisitor());
    // 添加变量加入scope
    Scope.addLocalVariable(new LocalVariable(varName, expression.getType()));
    return new VariableDeclarationStatement(varName,expression);
  }
}
