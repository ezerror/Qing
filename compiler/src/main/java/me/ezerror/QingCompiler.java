package me.ezerror;

import me.ezerror.parsing.SyntaxTreeTraverser;

/**
 * @author ：ezerror
 * @date ：Created in 2023/2/20 22:15
 * @description：编译器
 * @version:
 */
public class QingCompiler {

  public static void main(String[] args) throws Exception {
    new QingCompiler().compile(args);
  }

  public void compile(String[] args) throws Exception {
    String code = 
      "String name=\"Qing\" " +
        "var year = 2023 " +
        "print name " +
        "print year  ";
    new SyntaxTreeTraverser().parse(code);
  }
  
}
