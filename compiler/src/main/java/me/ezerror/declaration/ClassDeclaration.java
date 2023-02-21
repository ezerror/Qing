package me.ezerror.declaration;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import me.ezerror.bytecode.instructions.Instruction;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 编译单元类 - 维护本次编译的相关上下文
 * @author ：ezerror
 * @date ：Created in 2023/2/22 22:33
 * @description：
 * @version:
 */
@Getter
@Setter
public class ClassDeclaration {
  private String className;

  Queue<Instruction> instructionsQueue = new ArrayDeque<>();

  public ClassDeclaration(String className) {
    this.className = className;
  }
  
}
