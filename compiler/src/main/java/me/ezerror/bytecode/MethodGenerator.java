package me.ezerror.bytecode;

import jdk.nashorn.internal.ir.Block;
import me.ezerror.bytecode.base.AbstractByteGenerator;
import me.ezerror.domain.MethodDeclaration;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

/**
 * 方法 - 字节码生成
 * @author ：ezerror
 * @date ：Created in 2023/3/7 22:47
 */
public class MethodGenerator extends AbstractByteGenerator {

  private final ClassWriter classWriter;
  public MethodGenerator(ClassWriter classWriter) {
    this.classWriter = classWriter;
  }

  /**
   * 生成字节码
   * 维护的实际是classWriter
   * @param methodDeclaration
   */
  public void generate(MethodDeclaration methodDeclaration) {
    String methodName = methodDeclaration.getName();
    int access = Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC;
    // TODO: 参数签命亟待封装
    MethodVisitor mv = classWriter.visitMethod(access, methodName, "([Ljava/lang/String;)V", null, null);
    mv.visitCode();
    mv.visitMaxs(-1,-1);
    mv.visitEnd();
  }
}
