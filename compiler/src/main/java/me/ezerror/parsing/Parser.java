package me.ezerror.parsing;

import me.ezerror.QingLexer;
import me.ezerror.QingParser;
import me.ezerror.domain.ClassDeclaration;
import me.ezerror.parsing.visitor.ClassVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

/**
 * 解析器
 */
public class Parser {
  
  /**
   * 获取类定义
   *
   * @param fileAbsolutePath
   * @return
   */
  public ClassDeclaration parse(String fileAbsolutePath) throws IOException {
    CharStream charStream = CharStreams.fromFileName(fileAbsolutePath);
    QingLexer qingLexer = new QingLexer(charStream);
    CommonTokenStream tokenStream = new CommonTokenStream(qingLexer);
    QingParser qingParser = new QingParser(tokenStream);
    QingTreeWalkErrorListener qingTreeWalkErrorListener = new QingTreeWalkErrorListener();
    qingParser.addErrorListener(qingTreeWalkErrorListener);
    ClassVisitor classVisitor = new ClassVisitor();
    return qingParser.compilationUnit().classDeclaration().accept(classVisitor);
  }
  
}
