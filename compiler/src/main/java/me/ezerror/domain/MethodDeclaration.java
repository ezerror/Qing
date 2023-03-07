package me.ezerror.domain;

import lombok.Data;
import me.ezerror.domain.type.Type;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 函数定义
 * @author ：ezerror
 * @date ：Created in 2023/3/6 23:26
 * @description：
 * @version:
 */
@Data
public class MethodDeclaration implements DescriptorProvider{
  private String name;
  private List<Parameter> parameters;
  private Type returnType;
  
  // 目前都是 public static 
  private int access = Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC;

  @Override
  public String getDescriptor() {
    String parametersDescriptor = parameters.stream()
      .map(parameter -> parameter.getType().getDescriptor())
      .collect(Collectors.joining("", "(", ")"));
    String returnDescriptor = returnType.getDescriptor();
    return parametersDescriptor + returnDescriptor;
  }
 
}
