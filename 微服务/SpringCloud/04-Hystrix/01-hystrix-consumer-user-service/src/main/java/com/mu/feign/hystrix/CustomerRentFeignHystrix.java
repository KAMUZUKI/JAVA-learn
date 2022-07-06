package com.mu.feign.hystrix;

import com.mu.feign.CustomerRentFeign;
import org.springframework.stereotype.Component;

/**
 * 这个方法就是备选方案
 * @author MUZUKI
 */

@Component
public class CustomerRentFeignHystrix implements CustomerRentFeign {
    @Override
    public String rent() {
        return "我是备胎";
    }
}
