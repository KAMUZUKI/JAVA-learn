package com.mu.blog;

import com.mu.blog.framework.domain.DingtalkUser;
import com.mu.blog.system.utils.SystemUtils;

import java.util.Date;

/**
 * @author : MUZUKI
 * @date : 2023-03-27 16:03
 **/

public class UrlTest {
    public static void main(String[] args) {
        DingtalkUser dingtalkUser = new DingtalkUser();
        dingtalkUser.setUuid("lkasjkmsafmsaf").setUsername("muzuki").setStatus("1");
        String url = "http://localhost:8081/";
        System.out.println(url + SystemUtils.entityToUrlParam(dingtalkUser, true));
    }
}
