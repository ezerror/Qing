package me.ezerror.visitor;

import me.ezerror.QingBaseVisitor;
import me.ezerror.QingParser;
import me.ezerror.bytecode.instructions.Instruction;
import me.ezerror.declaration.ClassDeclaration;
import me.ezerror.domain.Variable;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class ClassVisitor extends QingBaseVisitor<ClassDeclaration> {

  private Map<String, Variable> variableMap = new HashMap<>();
  
  @Override
  public ClassDeclaration visitClassDeclaration(QingParser.ClassDeclarationContext ctx) {
    String name = ctx.className().getText();
    ClassDeclaration classDeclaration = new ClassDeclaration(name);
    QingParser.ClassBodyContext classBodyContext = ctx.classBody();
    Queue<Instruction> instructionsQueue = classBodyContext.children.stream().map(visitStatement())
      .collect(Collectors.toCollection(
      (Supplier<Queue<Instruction>>) ArrayDeque::new
    ));
    classDeclaration.setInstructionsQueue(instructionsQueue);
    return classDeclaration;
  }

  /**
   * 访问每条语句
   * - 分为两种
   *  PrintStatement
   *  VariableDeclarationStatement
   * @return
   */
  private Function<ParseTree, Instruction> visitStatement() {
    VariableVisitor variableVisitor = new VariableVisitor(variableMap);
    PrintVisitor printVisitor = new PrintVisitor(variableMap);
    return a -> {
      if (a instanceof QingParser.VariableContext) {
        return  a.accept(variableVisitor);
      }
      if (a instanceof QingParser.PrintContext) {
        return  a.accept(printVisitor);
      }
      throw new RuntimeException("存在语句未识别");
    };
  }
}
