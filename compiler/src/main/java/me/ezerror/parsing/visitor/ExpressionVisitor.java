package me.ezerror.parsing.visitor;

import me.ezerror.QingBaseVisitor;
import me.ezerror.QingParser;
import me.ezerror.domain.LocalVariable;
import me.ezerror.domain.expression.LocalVariableReference;
import me.ezerror.domain.expression.Value;
import me.ezerror.domain.inter.Expression;
import me.ezerror.domain.type.Type;
import me.ezerror.parsing.scope.Scope;
import me.ezerror.util.TypeResolver;

/**
 * @author ：ezerror
 * @date ：Created in 2023/3/8 22:47
 */
public class ExpressionVisitor extends QingBaseVisitor<Expression> {
  @Override
  public Expression visitVarReference(QingParser.VarReferenceContext ctx) {
    String varName = ctx.getText();
    LocalVariable variable = Scope.getLocalVariable(varName);
    return new LocalVariableReference(variable);
  }

  @Override
  public Expression visitValue(QingParser.ValueContext ctx) {
    String value = ctx.getText();
    Type type = TypeResolver.resolve(ctx);
    return new Value(value, type);
  }
}
