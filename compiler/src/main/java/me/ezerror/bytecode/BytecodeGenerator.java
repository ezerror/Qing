package me.ezerror.bytecode;

import me.ezerror.bytecode.instructions.Instruction;
import me.ezerror.bytecode.instructions.VariableDeclarationInstruction;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import java.util.Queue;

/**
 * 字节码生成器
 */
public class BytecodeGenerator implements Opcodes {

  /**
   * 生成字节码
   * @param instructionQueue
   * @param name
   * @return
   * @throws Exception
   */
    public byte[] generateBytecode(Queue<Instruction> instructionQueue, String name) throws Exception {
        ClassWriter cw = new ClassWriter(0);
        MethodVisitor mv;
        cw.visit(52, ACC_PUBLIC + ACC_SUPER, name, null, "java/lang/Object", null);
        {
            // 声明main方法
            mv = cw.visitMethod(ACC_PUBLIC + ACC_STATIC, "main", "([Ljava/lang/String;)V", null, null);
            final long localVariablesCount = instructionQueue.stream()
                    .filter(instruction -> instruction instanceof VariableDeclarationInstruction)
                    .count();
            final int maxStack = 100;
            // 执行从解析树中生成的指令
            for (Instruction instruction : instructionQueue) {
                instruction.apply(mv);
            }
            // 插入return指令
            mv.visitInsn(RETURN);
            mv.visitMaxs(maxStack, (int) localVariablesCount);
            mv.visitEnd();
        }
        cw.visitEnd();

        return cw.toByteArray();
    }
}  
