package me.ezerror.bytecode;

import me.ezerror.bytecode.base.AbstractByteGenerator;
import me.ezerror.bytecode.statement.PrintStatementGenerator;
import me.ezerror.bytecode.statement.VariableDeclarationStatementGenerator;
import me.ezerror.domain.inter.Statement;
import me.ezerror.domain.statement.PrintStatement;
import me.ezerror.domain.statement.VariableDeclarationStatement;
import org.objectweb.asm.MethodVisitor;

/**
 * @author ：ezerror
 * @date ：Created in 2023/3/8 21:40
 */
public class StatementGenerator extends AbstractByteGenerator {
  private final MethodVisitor methodvisitor;

  private final PrintStatementGenerator printStatementGenerator;
  private final VariableDeclarationStatementGenerator variableDeclarationStatementGenerator ;


  public StatementGenerator(MethodVisitor methodVisitor) {
    this.methodvisitor = methodVisitor;
    printStatementGenerator =   new PrintStatementGenerator(methodVisitor);
    variableDeclarationStatementGenerator = new VariableDeclarationStatementGenerator(methodVisitor);
  }

  public void generate(Statement stmt) {
    if(stmt instanceof PrintStatement){
      printStatementGenerator.generate((PrintStatement)stmt);
    }

    if(stmt instanceof VariableDeclarationStatement){
      variableDeclarationStatementGenerator.generate((VariableDeclarationStatement) stmt);
    }
  }
}
