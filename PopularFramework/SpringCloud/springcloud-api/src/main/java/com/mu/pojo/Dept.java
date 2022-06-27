package com.mu.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author MUZUKI
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
public class Dept implements Serializable {
    private int deptno;
    private String name;
    private String databaseName;

    public Dept(String name) {
        this.name = name;
    }
}
