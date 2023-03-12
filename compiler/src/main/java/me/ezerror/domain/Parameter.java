package me.ezerror.domain;

import lombok.Data;
import me.ezerror.domain.type.Type;

/**
 * @author ：ezerror
 * @date ：Created in 2023/3/7 23:28
 */
@Data
public class Parameter {
  private  String name;
  private Type type;
}
