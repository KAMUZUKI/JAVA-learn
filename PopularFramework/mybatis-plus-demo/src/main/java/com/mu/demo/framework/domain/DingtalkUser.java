package com.mu.demo.framework.domain;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author MUZUKI
 * @Classname DingtalkUser
 * @Description TODO
 * @Date 2023/3/26 16:13
 */

@Data
@Accessors(chain = true)
public class DingtalkUser {
    private String uuid;

    private String username;
}
