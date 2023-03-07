package me.ezerror.parsing.visitor;

import me.ezerror.QingBaseVisitor;
import me.ezerror.QingParser;
import me.ezerror.domain.MethodDeclaration;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 函数访问器
 * @author ：ezerror
 * @date ：Created in 2023/3/6 23:29
 */
public class FunctionVisitor extends QingBaseVisitor<MethodDeclaration> {
  private MethodDeclaration methodDeclaration = new MethodDeclaration();
  @Override
  public MethodDeclaration visitFunction(QingParser.FunctionContext ctx) {
    // 函数定义部分
    QingParser.FunctionDeclarationContext functionDeclarationContext = ctx.functionDeclaration();
    String functionName = functionDeclarationContext.functionName().getText();
    methodDeclaration.setName(functionName);
    // statement
    List<QingParser.FunctionStatementContext> functionStatementContexts = ctx.functionStatement();
    List<Object> collect = functionStatementContexts.stream().map(statement -> statement.accept(new StatementVisitor())).collect(Collectors.toList());
    return methodDeclaration;
  }
}
