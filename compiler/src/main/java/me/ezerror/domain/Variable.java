package me.ezerror.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author ：ezerror
 * @date ：Created in 2023/2/20 21:59
 * @description：
 * @version:
 */
@AllArgsConstructor
@Getter
@Setter
public class Variable {
  private int id;
  private int type;
  private String value;
}
