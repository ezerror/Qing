package me.ezerror.parsing.scope;


import me.ezerror.domain.LocalVariable;
import org.apache.commons.collections4.map.LinkedMap;

import java.util.LinkedHashMap;

/**
 * @author ：ezerror
 * @date ：Created in 2023/3/10 0:26
 */
public class Scope {
  
  private static LinkedMap<String,LocalVariable> localVariables = new LinkedMap<>();
  public static LocalVariable getLocalVariable(String varName) {
    return localVariables.get(varName);
  }
  public static int getLocalVariableIndex(String varName) {
    return localVariables.indexOf(varName);
  }


  public static void addLocalVariable(LocalVariable localVariable) {
    localVariables.put(localVariable.getName(), localVariable);
  }
}
