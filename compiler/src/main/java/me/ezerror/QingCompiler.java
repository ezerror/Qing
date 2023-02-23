package me.ezerror;

import me.ezerror.bytecode.BytecodeGenerator;
import me.ezerror.declaration.ClassDeclaration;
import me.ezerror.parsing.SyntaxTreeTraverser;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

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
    String fileAbsolutePath = qingFile.getAbsolutePath();
    ClassDeclaration classDeclaration= new SyntaxTreeTraverser().getClassDeclaration(fileAbsolutePath);
    writeBytecodeToClassFile(fileAbsolutePath, classDeclaration);
  }

  private static void writeBytecodeToClassFile(String fileName, ClassDeclaration classDeclaration) throws IOException {
    byte[] byteCode = new BytecodeGenerator().generateBytecode(classDeclaration);
    String classFile = fileName.substring(0,fileName.lastIndexOf(File.separatorChar)+1) + classDeclaration.getClassName()+".class";
    Path path = Paths.get(classFile);
    OutputStream os = Files.newOutputStream(path);
    os.write(byteCode);
    os.close();
  }
  
}
