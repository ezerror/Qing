package me.ezerror.bytecode.statement;

import me.ezerror.bytecode.base.AbstractByteGenerator;
import me.ezerror.domain.expression.Value;
import me.ezerror.domain.statement.VariableDeclarationStatement;
import me.ezerror.domain.type.Type;
import me.ezerror.parsing.scope.Scope;
import org.objectweb.asm.MethodVisitor;

/**
 * @author ：ezerror
 * @date ：Created in 2023/3/8 22:13
 */
public class VariableDeclarationStatementGenerator extends AbstractByteGenerator {

  private final MethodVisitor methodvisitor;

  public VariableDeclarationStatementGenerator(MethodVisitor methodVisitor) {
    methodvisitor = methodVisitor;
  }

  public void generate(VariableDeclarationStatement variableDeclarationStatement) {
    String name = variableDeclarationStatement.getName();
    Value expression = (Value) variableDeclarationStatement.getExpression();
    Type type = expression.getType();
    if(type == Type.INT) {
      int val = Integer.parseInt(expression.getValue());
      methodvisitor.visitIntInsn(SIPUSH,val);
      methodvisitor.visitVarInsn(ISTORE, Scope.getLocalVariableIndex(name));
    } else if(type == Type.STRING) {
      methodvisitor.visitLdcInsn(expression.getValue());
      methodvisitor.visitVarInsn(ASTORE,Scope.getLocalVariableIndex(name));
    }
  }
}
