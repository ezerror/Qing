package me.ezerror.domain.statement;

import lombok.Data;
import me.ezerror.domain.inter.Expression;
import me.ezerror.domain.inter.Statement;

/**
 * @author ：ezerror
 * @date ：Created in 2023/3/8 22:31
 */
@Data
public class ReturnStatement implements Statement {
  Expression expression;
}
