package me.ezerror.domain.expression;

import lombok.Data;
import me.ezerror.domain.LocalVariable;
import me.ezerror.domain.inter.Expression;
import me.ezerror.domain.type.Type;

/**
 * @author ：ezerror
 * @date ：Created in 2023/3/10 0:26
 */
@Data
public class LocalVariableReference implements Expression {

  private final LocalVariable variable;
  public LocalVariableReference(LocalVariable variable) {
    this.variable = variable;
  }

  @Override
  public Type getType() {
    return variable.getType();
  }
}
