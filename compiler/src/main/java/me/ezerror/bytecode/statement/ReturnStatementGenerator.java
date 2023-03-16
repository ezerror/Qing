package me.ezerror.bytecode.statement;

import me.ezerror.bytecode.base.AbstractByteGenerator;
import me.ezerror.domain.expression.LocalVariableReference;
import me.ezerror.domain.inter.Expression;
import me.ezerror.domain.statement.PrintStatement;
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
    LocalVariableReference expression = (LocalVariableReference) returnStatement.getExpression();
    final Type type = expression.getType();
    final int id = Scope.getLocalVariableIndex(expression.getVariable().getName());
    if (type == Type.INT) {
      methodVisitor.visitVarInsn(ILOAD, id);
      methodVisitor.visitInsn(IRETURN);
    } else if (type == Type.STRING) {
      methodVisitor.visitVarInsn(ALOAD, id);
      methodVisitor.visitInsn(ARETURN);
    }
  }
}
