package me.ezerror.parsing;

import lombok.extern.slf4j.Slf4j;
import me.ezerror.QingBaseListener;
import me.ezerror.QingParser;
import me.ezerror.bytecode.instructions.Instruction;
import me.ezerror.bytecode.instructions.PrintVariableInstruction;
import me.ezerror.bytecode.instructions.VariableDeclarationInstruction;
import me.ezerror.domain.Variable;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

/**
 * @author ：ezerror
 * @date ：Created in 2023/2/20 21:59
 * @description：
 * @version:
 */
@Slf4j
public class QingTreeWalkListener extends QingBaseListener {
  /**
   * 定义上下文中的变量名
   */
  Map<String, Variable> variableMap = new HashMap<>();

  Queue<Instruction> instructionsQueue = new ArrayDeque<>();

  @Override
  public void exitVariable(QingParser.VariableContext ctx) {
    final TerminalNode varName = ctx.ID();
    final QingParser.ValueContext varValue = ctx.value();
    final int varType = varValue.getStart().getType();
    final int varIndex = variableMap.size();
    final String varTextValue = varValue.getText();
    Variable var = new Variable(varIndex, varType, varTextValue);
    if (variableMap.containsKey(varName.getText())) {
      log.error("你要定义变量{}，这个变量已经定义过了", varName.getText());
      return;
    }
    variableMap.put(varName.getText(), var);
    instructionsQueue.add(new VariableDeclarationInstruction(var));
    log.info("你定义了一个变量，变量名为{}，它的值为{}", varName.getText(), varValue.getText());
  }

  @Override
  public void exitPrint(QingParser.PrintContext ctx) {
    final TerminalNode varName = ctx.ID();
    boolean printedVarNotDeclared = !variableMap.containsKey(varName.getText());
    if (printedVarNotDeclared) {
      log.error("你要打印的变量{}从未定义过", varName.getText());
      return;
    }
    final Variable variable = variableMap.get(varName.getText());
    instructionsQueue.add(new PrintVariableInstruction(variable));
    log.info("你要打印一个变量,变量名为{},实际值为{}", varName.getText(), variableMap.get(varName.getText()));
  }

  public Queue<Instruction> getInstructionsQueue() {
    return instructionsQueue;
  }
}

