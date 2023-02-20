package me.ezerror.parsing;

import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

@Slf4j
public class QingTreeWalkErrorListener extends BaseErrorListener {
  @Override
  public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
    log.error("第{}行不符合语法规则,详情如下\n{}",line,msg);
  }
}
