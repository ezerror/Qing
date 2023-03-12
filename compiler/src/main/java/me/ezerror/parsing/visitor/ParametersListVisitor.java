package me.ezerror.parsing.visitor;

import me.ezerror.QingBaseVisitor;
import me.ezerror.QingParser;
import me.ezerror.domain.Parameter;
import me.ezerror.util.TypeResolver;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 函数访问器
 * @author ：ezerror
 * @date ：Created in 2023/3/6 23:29
 */
public class ParametersListVisitor extends QingBaseVisitor<List<Parameter>> {
  @Override
  public List<Parameter> visitParametersList(QingParser.ParametersListContext ctx) {
    return ctx.parameter()
      .stream().map(context -> {
        Parameter parameter = new Parameter();
        parameter.setName(context.parameterName().getText());
        parameter.setType(TypeResolver.resolve(context.type()));
        return parameter;
      }).collect(Collectors.toList());
  }
}
