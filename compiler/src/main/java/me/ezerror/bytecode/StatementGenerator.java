package me.ezerror.bytecode;

import me.ezerror.bytecode.base.AbstractByteGenerator;
import me.ezerror.bytecode.statement.PrintStatementGenerator;
import me.ezerror.bytecode.statement.VariableDeclarationStatementGenerator;
import org.objectweb.asm.MethodVisitor;

/**
 * @author ：ezerror
 * @date ：Created in 2023/3/8 21:40
 */
public class StatementGenerator extends AbstractByteGenerator {
  private final MethodVisitor methodvisitor;

  private PrintStatementGenerator printStatementGenerator = new PrintStatementGenerator();
  private VariableDeclarationStatementGenerator variableDeclarationStatementGenerator;


  public StatementGenerator(MethodVisitor methodVisitor) {
    this.methodvisitor = methodVisitor;
  }
  
}
