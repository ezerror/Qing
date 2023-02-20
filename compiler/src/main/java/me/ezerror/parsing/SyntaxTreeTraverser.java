package me.ezerror.parsing;

import me.ezerror.QingLexer;
import me.ezerror.QingParser;
import me.ezerror.bytecode.instructions.Instruction;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.Queue;

/**
 * 语法树遍历器
 */
public class SyntaxTreeTraverser {

  /**
   * 获取指令集
   * @param code
   * @return
   */
  public Queue<Instruction> getInstructions(String code) {
    CodePointCharStream codePointCharStream = CharStreams.fromString(code);
    QingLexer qingLexer = new QingLexer(codePointCharStream);
    CommonTokenStream tokenStream = new CommonTokenStream(qingLexer);
    QingParser qingParser = new QingParser(tokenStream);
    QingTreeWalkListener qingTreeWalkListener = new QingTreeWalkListener();
    QingTreeWalkErrorListener qingTreeWalkErrorListener = new QingTreeWalkErrorListener();
    qingParser.addParseListener(qingTreeWalkListener);
    qingParser.addErrorListener(qingTreeWalkErrorListener);
    qingParser.compilationUnit();
    return qingTreeWalkListener.getInstructionsQueue();
  }
  /**
   * 解析代码，并执行回调函数
   * @param code
   */
    public void parse(String code){
      CodePointCharStream codePointCharStream = CharStreams.fromString(code);
      QingLexer qingLexer = new QingLexer(codePointCharStream);
      CommonTokenStream tokenStream = new CommonTokenStream(qingLexer);
      QingParser qingParser = new QingParser(tokenStream);
      QingTreeWalkListener qingTreeWalkListener = new QingTreeWalkListener();
      QingTreeWalkErrorListener qingTreeWalkErrorListener = new QingTreeWalkErrorListener();
      qingParser.addParseListener(qingTreeWalkListener);
      qingParser.addErrorListener(qingTreeWalkErrorListener);
      qingParser.compilationUnit();
    }
}
