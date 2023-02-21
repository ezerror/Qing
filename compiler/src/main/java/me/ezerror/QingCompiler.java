package me.ezerror;

import me.ezerror.bytecode.BytecodeGenerator;
import me.ezerror.bytecode.instructions.Instruction;
import me.ezerror.parsing.SyntaxTreeTraverser;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
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
    File qingFile = new File(args[0]);
    String fileName = qingFile.getName();
    String fileAbsolutePath = qingFile.getAbsolutePath();
    String className = StringUtils.remove(fileName, ".qing");
    final Queue<Instruction> instructions = new SyntaxTreeTraverser().getInstructions(fileAbsolutePath);
    final byte[] byteCode = new BytecodeGenerator().generateBytecode(instructions, className);
    writeBytecodeToClassFile(fileAbsolutePath, byteCode);
  }

  private static void writeBytecodeToClassFile(String fileName, byte[] byteCode) throws IOException {
    String classFile = StringUtils.replace(fileName, ".qing", ".class");
    OutputStream os = Files.newOutputStream(Paths.get(classFile));
    os.write(byteCode);
    os.close();
  }
  
}
