package me.ezerror.bytecode;

import me.ezerror.bytecode.base.AbstractByteGenerator;
import me.ezerror.domain.MethodDeclaration;
import me.ezerror.domain.statement.ReturnStatement;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;

/**
 * 方法 - 字节码生成
 *
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
   *
   * @param method
   */
  public void generate(MethodDeclaration method) {
    MethodVisitor mv = classWriter.visitMethod(method.getAccess(), method.getName(), method.getDescriptor(), null, null);
    mv.visitCode();
    StatementGenerator statementScopeGenerator = new StatementGenerator(mv);
    method.getStatements().stream().forEach(stmt ->
      statementScopeGenerator.generate(stmt)
    );
    // 如果没有返回语句
    if (!(method.getStatements().get(method.getStatements().size() - 1) instanceof ReturnStatement)) {
      mv.visitInsn(RETURN);
    }
    mv.visitMaxs(-1, -1);
    mv.visitEnd();
  }
}
