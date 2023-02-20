package me.ezerror.bytecode.instructions;

import me.ezerror.QingLexer;
import me.ezerror.domain.Variable;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public class PrintVariableInstruction implements Instruction, Opcodes {
  Variable variable;
    public PrintVariableInstruction(Variable variable) {
        this.variable = variable;
    }

    @Override
    public void apply(MethodVisitor mv) {
        final int type = variable.getType();
        final int id = variable.getId();
        mv.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
        if (type == QingLexer.NUMBER) {
            mv.visitVarInsn(ILOAD, id);
            mv.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(I)V", false);
        } else if (type == QingLexer.STRING) {
            mv.visitVarInsn(ALOAD, id);
            mv.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V", false);
        }
    }
}
