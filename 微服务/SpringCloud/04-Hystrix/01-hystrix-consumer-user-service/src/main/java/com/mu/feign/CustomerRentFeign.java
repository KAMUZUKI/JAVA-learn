package com.mu.feign;

import com.mu.feign.hystrix.CustomerRentFeignHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author MUZUKI
 * CustomerRentFiegn Interface
 * 这里需要指定熔断的类   CustomerRentFeignHystrix.class
 */
@FeignClient(value = "rent-car-service",fallback = CustomerRentFeignHystrix.class)
public interface CustomerRentFeign {
    /**
     * customerRent
     * @return java.lang.String
     */
    @GetMapping("rent")
    public String rent();
}
