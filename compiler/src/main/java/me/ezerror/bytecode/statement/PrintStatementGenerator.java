package me.ezerror.bytecode.statement;

import me.ezerror.bytecode.base.AbstractByteGenerator;
import me.ezerror.domain.expression.LocalVariableReference;
import me.ezerror.domain.statement.PrintStatement;
import me.ezerror.domain.type.Type;
import me.ezerror.parsing.scope.Scope;
import org.objectweb.asm.MethodVisitor;

/**
 * @author ：ezerror
 * @date ：Created in 2023/3/8 22:13
 */
public class PrintStatementGenerator extends AbstractByteGenerator {
  private final MethodVisitor methodVisitor;

  public PrintStatementGenerator(MethodVisitor methodVisitor) {
    this.methodVisitor = methodVisitor;
  }

  public void generate(PrintStatement printStatement) {
    LocalVariableReference expression = (LocalVariableReference) printStatement.getExpression();
    final Type type = expression.getType();
    final int id = Scope.getLocalVariableIndex(expression.getVariable().getName());
    methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
    if (type == Type.INT) {
      methodVisitor.visitVarInsn(ILOAD, id);
      methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(I)V", false);
    } else if (type == Type.STRING) {
      methodVisitor.visitVarInsn(ALOAD, id);
      methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V", false);
    }
  }
}
