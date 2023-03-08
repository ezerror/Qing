package me.ezerror.parsing.visitor;

import me.ezerror.QingBaseVisitor;
import me.ezerror.QingParser;
import me.ezerror.domain.inter.Statement;
import me.ezerror.domain.statement.PrintStatement;
import me.ezerror.domain.statement.VariableDeclarationStatement;

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
    VariableDeclarationStatement statement = new VariableDeclarationStatement();
    statement.setName(ctx.name().getText());
    statement.setExpression(ctx.expression().accept(new ExpressionVisitor()));
    return statement;
  }
}
