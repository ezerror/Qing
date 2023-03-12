//package me.ezerror.parsing.visitor;
//
//import lombok.extern.slf4j.Slf4j;
//import me.ezerror.QingBaseVisitor;
//import me.ezerror.QingParser;
//import me.ezerror.bytecode.instructions.Instruction;
//import me.ezerror.bytecode.instructions.PrintVariableInstruction;
//import me.ezerror.domain.Variable;
//import org.antlr.v4.runtime.tree.TerminalNode;
//
//import java.util.Map;
//
///**
// * @author ：ezerror
// * @date ：Created in 2023/2/27 22:27
// * @description：
// * @version:
// */
//@Slf4j
//public class PrintVisitor extends QingBaseVisitor<Instruction> {
//
//  private Map<String,Variable> variableMap;
//
//  public PrintVisitor(Map<String, Variable> variableMap) {
//    this.variableMap = variableMap;
//  }
//
//  @Override
//  public Instruction visitPrint(QingParser.PrintContext ctx) {
//    final TerminalNode varName = ctx.ID();
//    boolean printedVarNotDeclared = !variableMap.containsKey(varName.getText());
//    if (printedVarNotDeclared) {
//      throw new RuntimeException(String.format("你要打印的变量%s从未定义过", varName.getText()));
//    }
//    final Variable variable = variableMap.get(varName.getText());
//    log.info("你要打印一个变量,变量名为{},实际值为{}", varName.getText(), variableMap.get(varName.getText()).getValue());
//    return new PrintVariableInstruction(variable);
//  }
//
//  
//}
