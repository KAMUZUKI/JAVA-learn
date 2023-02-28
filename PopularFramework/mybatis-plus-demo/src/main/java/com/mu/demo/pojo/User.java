package com.mu.demo.pojo;

/**
 * @author : MUZUKI
 * @date : 2023-02-28 19:01
 **/

import lombok.Data;
import java.time.LocalDateTime;
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
    private Long managerId;
    private LocalDateTime createTime;
}
