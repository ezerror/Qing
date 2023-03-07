package me.ezerror;

import me.ezerror.bytecode.ClassGenerator;
import me.ezerror.domain.ClassDeclaration;
import me.ezerror.parsing.Parser;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 编译器
 * @author ：ezerror
 * @date ：Created in 2023/2/20 22:15
 */
public class Compiler {

  public static void main(String[] args) throws Exception {
    new Compiler().compile(args);
  }

  /**
   * 编译
   * @param args 参数 
   * @throws Exception
   */
  public void compile(String[] args) throws Exception {
    File qingFile = new File(args[0]);
    String fileAbsolutePath = qingFile.getAbsolutePath();
    ClassDeclaration classDeclaration= new Parser().parse(fileAbsolutePath);
    writeBytecodeToClassFile(fileAbsolutePath, classDeclaration);
  }

  /**
   * 写入字节码
   * @param fileName
   * @param classDeclaration
   * @throws IOException
   */
  private static void writeBytecodeToClassFile(String fileName, ClassDeclaration classDeclaration) throws IOException {
    ClassGenerator bytecodeGenerator = new ClassGenerator();
    byte[] byteCode = bytecodeGenerator.generate(classDeclaration);
    String classFile = fileName.substring(0,fileName.lastIndexOf(File.separatorChar)+1) + classDeclaration.getName()+".class";
    Path path = Paths.get(classFile);
    OutputStream os = Files.newOutputStream(path);
    os.write(byteCode);
    os.close();
  }
  
}
