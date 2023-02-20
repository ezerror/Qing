package me.ezerror.bytecode.instructions;

import me.ezerror.QingLexer;
import me.ezerror.domain.Variable;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

/**
 * 变量定义指令
 */
public class VariableDeclarationInstruction implements Instruction, Opcodes {
    Variable variable;

    public VariableDeclarationInstruction(Variable variable) {
        this.variable = variable;
    }

    @Override
    public void apply(MethodVisitor mv) {
        final int type = variable.getType();
        if(type == QingLexer.NUMBER) {
            int val = Integer.parseInt(variable.getValue());
            mv.visitIntInsn(SIPUSH,val);
            mv.visitVarInsn(ISTORE,variable.getId());
        } else if(type == QingLexer.STRING) {
            mv.visitLdcInsn(variable.getValue());
            mv.visitVarInsn(ASTORE,variable.getId());
        }
    }
}
