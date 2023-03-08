package me.ezerror.parsing.visitor;

import me.ezerror.QingBaseVisitor;
import me.ezerror.QingParser;
import me.ezerror.domain.inter.Expression;

/**
 * @author ：ezerror
 * @date ：Created in 2023/3/8 22:47
 */
public class ExpressionVisitor extends QingBaseVisitor<Expression> {
  @Override
  public Expression visitExpression(QingParser.ExpressionContext ctx) {
     return new Expression() {
    };
  }
}
