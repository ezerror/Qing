package me.ezerror.util;

import me.ezerror.QingParser;
import me.ezerror.domain.type.Type;

import java.util.Arrays;
import java.util.Optional;

/**
 * 类型解析器
 * @author ：ezerror
 * @date ：Created in 2023/3/7 23:45
 */
public class TypeResolver {
  /**
   * 解析类型
   * @param typeContext
   * @return
   */
  public static Type resolve(QingParser.TypeContext typeContext){
    if(typeContext == null){
      return Type.VOID;
    }
    String text = typeContext.getText();
    Optional<Type> type = Arrays.stream(Type.values()).filter(t -> t.getName().equals(text)).findFirst();
    if(type.isPresent()){
      return type.get();
    }
    throw new RuntimeException("WRONG TYPE");
  }
}
