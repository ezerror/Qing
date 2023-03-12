package me.ezerror.domain.statement;

import lombok.AllArgsConstructor;
import lombok.Data;
import me.ezerror.domain.inter.Expression;
import me.ezerror.domain.inter.Statement;

/**
 * 
 * @author ：ezerror
 * @date ：Created in 2023/3/8 22:32
 */
@Data
@AllArgsConstructor
public class VariableDeclarationStatement implements Statement {
  private String name;
  Expression expression;
}
