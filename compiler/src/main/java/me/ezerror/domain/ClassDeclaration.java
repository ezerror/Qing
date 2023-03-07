package me.ezerror.domain;

import lombok.Data;

import java.util.List;

/**
 * 类定义
 * @author ：ezerror
 * @date ：Created in 2023/3/6 23:20
 * @description：
 * @version:
 */
@Data
public class ClassDeclaration {
    private String name ;
    private List<MethodDeclaration> methods;
  
}
