package me.ezerror.bytecode;


import me.ezerror.bytecode.base.AbstractByteGenerator;
import me.ezerror.domain.ClassDeclaration;
import me.ezerror.domain.MethodDeclaration;
import org.objectweb.asm.ClassWriter;

import java.util.List;

/**
 * 类 - 字节码生成器
 */
public class ClassGenerator extends AbstractByteGenerator {
  private static final int CLASS_VERSION = 52;
  private final ClassWriter classWriter = new ClassWriter(ClassWriter.COMPUTE_FRAMES + ClassWriter.COMPUTE_MAXS);

  /**
   * 生成类文件字节码
   *
   * @param classDeclaration
   * @return
   */
  public byte[] generate(ClassDeclaration classDeclaration) {
    String className = classDeclaration.getName();
    classWriter.visit(V1_8, ACC_PUBLIC + ACC_SUPER, className, null, "java/lang/Object", null);
    List<MethodDeclaration> methods = classDeclaration.getMethods();
    MethodGenerator methodGenerator = new MethodGenerator(classWriter);
    for (MethodDeclaration method : methods) {
      methodGenerator.generate(method);
    }
    classWriter.visitEnd();
    classWriter.visitEnd();
    return classWriter.toByteArray();
  }
}  
