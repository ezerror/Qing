package me.ezerror.domain;

import lombok.Data;
import me.ezerror.domain.type.Type;

import java.util.List;

/**
 * 函数定义
 * @author ：ezerror
 * @date ：Created in 2023/3/6 23:26
 * @description：
 * @version:
 */
@Data
public class MethodDeclaration {
  private String name;
  private List<Parameter> parameters;
  private Type returnType;
  
  
}
