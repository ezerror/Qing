package me.ezerror.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import me.ezerror.domain.type.Type;

/**
 * @author ：ezerror
 * @date ：Created in 2023/3/10 0:18
 */
@Data
@AllArgsConstructor
public class LocalVariable {
    private  String name;
    private Type type;

}
