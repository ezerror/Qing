package me.ezerror.bytecode.statement;

import me.ezerror.bytecode.base.AbstractByteGenerator;
import me.ezerror.domain.expression.LocalVariableReference;
import me.ezerror.domain.expression.Value;
import me.ezerror.domain.inter.Expression;
import me.ezerror.domain.statement.ReturnStatement;
import me.ezerror.domain.type.Type;
import me.ezerror.parsing.scope.Scope;
import org.objectweb.asm.MethodVisitor;

/**
 * @author ：ezerror
 * @date ：Created in 2023/3/8 22:13
 */
public class ReturnStatementGenerator extends AbstractByteGenerator {
  private final MethodVisitor methodVisitor;

  public ReturnStatementGenerator(MethodVisitor methodVisitor) {
    this.methodVisitor = methodVisitor;
  }

  public void generate(ReturnStatement returnStatement) {
    Expression expression = returnStatement.getExpression();
    if(expression instanceof LocalVariableReference) {
      final Type type = expression.getType();
      final int id = Scope.getLocalVariableIndex(((LocalVariableReference)expression).getVariable().getName());
      if (type == Type.INT) {
        methodVisitor.visitVarInsn(ILOAD, id);
        methodVisitor.visitInsn(IRETURN);
      } else if (type == Type.STRING) {
        methodVisitor.visitVarInsn(ALOAD, id);
        methodVisitor.visitInsn(ARETURN);
      }
    }
    if(expression instanceof Value) {
      String value = ((Value) expression).getValue();
      final Type type = expression.getType();
      if(type == Type.INT) {
        int val = Integer.parseInt(value);
        methodVisitor.visitIntInsn(SIPUSH,val);
        methodVisitor.visitInsn(IRETURN);
      } else if(type == Type.STRING) {
        methodVisitor.visitLdcInsn(value);
        methodVisitor.visitInsn(ARETURN);
      }
    }
  }
}
