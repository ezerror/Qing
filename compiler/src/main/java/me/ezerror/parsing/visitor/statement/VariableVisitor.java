//package me.ezerror.parsing.visitor;
//
//import lombok.extern.slf4j.Slf4j;
//import me.ezerror.QingBaseVisitor;
//import me.ezerror.QingParser;
//import me.ezerror.bytecode.instructions.Instruction;
//import me.ezerror.bytecode.instructions.VariableDeclarationInstruction;
//import me.ezerror.domain.Variable;
//import org.antlr.v4.runtime.tree.TerminalNode;
//
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * @author ：ezerror
// * @date ：Created in 2023/2/27 22:27
// * @description：
// * @version:
// */
//@Slf4j
//public class VariableVisitor extends QingBaseVisitor<Instruction> {
//  
//  private Map<String,Variable> variableMap;
//
//  public VariableVisitor(Map<String, Variable> variableMap) {
//    this.variableMap = variableMap;
//  }
//
//  @Override
//  public Instruction visitVariable(QingParser.VariableContext ctx) {
//    final TerminalNode varName = ctx.ID();
//    final QingParser.ValueContext varValue = ctx.value();
//    final int varType = varValue.getStart().getType();
//    final int varIndex = variableMap.size();
//    final String varTextValue = varValue.getText();
//    Variable var = new Variable(varIndex, varType, varTextValue);
//    if (variableMap.containsKey(varName.getText())) {
//      throw new RuntimeException(String.format("你要定义变量%s，这个变量已经定义过了", varName.getText()));
//    }
//    variableMap.put(varName.getText(), var);
//    log.info("你定义了一个变量，变量名为{}，它的值为{}", varName.getText(), varValue.getText());
//    return new VariableDeclarationInstruction(var);
//  }
//  
//  
//}
