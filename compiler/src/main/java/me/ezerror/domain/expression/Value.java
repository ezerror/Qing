package me.ezerror.domain.expression;

import lombok.AllArgsConstructor;
import lombok.Data;
import me.ezerror.domain.inter.Expression;
import me.ezerror.domain.type.Type;

/**
 * @author ：ezerror
 * @date ：Created in 2023/3/8 22:43
 */
@Data
@AllArgsConstructor
public class Value implements Expression {
  
  private  String value;
  private Type type;
  
}
