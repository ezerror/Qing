package me.ezerror.bytecode.instructions;

import org.objectweb.asm.MethodVisitor;

/**
 * 指令接口
 */
public interface Instruction {
    void apply(MethodVisitor methodVisitor);
}
