package me.ezerror.parsing;

import me.ezerror.QingLexer;
import me.ezerror.QingParser;
import me.ezerror.declaration.ClassDeclaration;
import org.antlr.v4.runtime.*;

import java.io.IOException;

/**
 * 语法树遍历器
 */
public class SyntaxTreeTraverser {

  /**
   * 获取类定义
   *
   * @param fileAbsolutePath
   * @return
   */
  public ClassDeclaration getClassDeclaration(String fileAbsolutePath) throws IOException {
    CharStream charStream = CharStreams.fromFileName(fileAbsolutePath);
    QingLexer qingLexer = new QingLexer(charStream);
    CommonTokenStream tokenStream = new CommonTokenStream(qingLexer);
    QingParser qingParser = new QingParser(tokenStream);
    QingTreeWalkListener qingTreeWalkListener = new QingTreeWalkListener();
    QingTreeWalkErrorListener qingTreeWalkErrorListener = new QingTreeWalkErrorListener();
    qingParser.addParseListener(qingTreeWalkListener);
    qingParser.addErrorListener(qingTreeWalkErrorListener);
    qingParser.compilationUnit();
    return qingTreeWalkListener.getClassDeclaration();
  }
  
}
