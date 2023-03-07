package me.ezerror.parsing.visitor;

import me.ezerror.QingBaseVisitor;
import me.ezerror.QingParser;
import me.ezerror.domain.ClassDeclaration;
import me.ezerror.domain.MethodDeclaration;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 类访问器
 * @author ：ezerror
 * @date ：Created in 2023/3/6 23:29
 */
public class ClassVisitor extends QingBaseVisitor<ClassDeclaration> {

  /**
   * 类定义
   */
  private ClassDeclaration classDeclaration = new ClassDeclaration();

  /**
   * 当前上下文
   */
  private QingParser.ClassDeclarationContext  currentContext;

  @Override
  public ClassDeclaration visitClassDeclaration(QingParser.ClassDeclarationContext ctx) {
    currentContext = ctx;
    // 1、类名
    assembleClassName();
    // 2、函数
    assembleFunction();
    return classDeclaration;
  }

  /**
   * 组装函数
   */
  private void assembleFunction() {
    QingParser.ClassBodyContext classBodyContext = currentContext.classBody();
    List<QingParser.FunctionContext> functionCtx = classBodyContext.function();
    List<MethodDeclaration> methodDeclarationList = functionCtx.stream().map(function -> function.accept(new FunctionVisitor())).collect(Collectors.toList());
    classDeclaration.setMethods(methodDeclarationList);
  }

  /**
   * 组装类名
   */
  private void assembleClassName() {
    String className = currentContext.className().getText();
    classDeclaration.setName(className);
  }

}
