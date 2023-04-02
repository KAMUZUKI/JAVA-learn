package com.mu;

import cn.hutool.crypto.SecureUtil;
import com.mu.framework.domain.DingtalkUser;
import com.mu.system.utils.SystemUtils;
import org.junit.jupiter.api.Test;

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

    @Test
    public void test() {
        System.out.println(SecureUtil.md5("a"));
    }
}
