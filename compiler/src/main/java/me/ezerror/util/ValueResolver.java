package me.ezerror.util;

import me.ezerror.QingParser;

import java.util.Objects;

/**
 * @author ：ezerror
 * @date ：Created in 2023/3/12 13:48
 */
public class ValueResolver {
  public static String resolve(QingParser.ValueContext ctx) {
    if(Objects.nonNull(ctx.STRING())){
      return ctx.getText().replace("\"", "");
    }
    return ctx.getText();
  }
}
