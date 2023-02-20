package me.ezerror;

import me.ezerror.bytecode.BytecodeGenerator;
import me.ezerror.bytecode.instructions.Instruction;
import me.ezerror.parsing.SyntaxTreeTraverser;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Queue;

/**
 * @author ：ezerror
 * @date ：Created in 2023/2/20 22:15
 * @description：编译器
 * @version:
 */
public class QingCompiler {

  public static void main(String[] args) throws Exception {
    new QingCompiler().compile(args);
  }

  public void compile(String[] args) throws Exception {
    String code = 
      "var name=\"Qing\" " +
        "var year = 2023 " +
        "print name " +
        "print year  ";
    final Queue<Instruction> instructions = new SyntaxTreeTraverser().getInstructions(code);
    final byte[] byteCode = new BytecodeGenerator().generateBytecode(instructions, "first");
    writeBytecodeToClassFile("first.class", byteCode);
  }

  private static void writeBytecodeToClassFile(String fileName, byte[] byteCode) throws IOException {
    OutputStream os = Files.newOutputStream(Paths.get(fileName));
    os.write(byteCode);
    os.close();
  }
  
}
