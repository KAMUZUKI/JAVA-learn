package com.mu.feign;

import com.mu.domain.Order;
import com.mu.model.BaseResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @author MUZUKI
 * FeignClient  声明是 feign 的调用
 * value = "provider-order-service" value 后面的值必须和提供者的服务名一致
 */
@FeignClient(value = "provider-order-service")
public interface UserOrderFeign {
    /**
     *
     * 描述 : 下单的方法 这里的路径必须和提供者的路径一致
     * @param :
     * @return java.lang.String
     */
    @GetMapping("doOrder")
    String doOrder();

    /**
     * 测试单个参数
     *
     * @param name
     * @return
     */
    @GetMapping("testOneParam")
    public BaseResult oneParam(@RequestParam("name") String name);
    /**
     * 测试两个参数
     *
     * @param name
     * @param age
     * @return
     */
    @PostMapping("testTwoParam")
    public BaseResult twoParam(@RequestParam("name") String name,
                               @RequestParam("age") Integer age);
    /**
     * 测试一个对象的传参
     *
     * @param order
     * @return
     */
    @PostMapping("testObjectParam")
    public BaseResult objectParam(@RequestBody Order order);
    /**
     * 测试一个对象 一个参数
     *
     * @param order
     * @param name
     * @return
     */
    @PostMapping("testOneObjectOneParam")
    public BaseResult oneObjectOneParam(@RequestBody Order order,
                                        @RequestParam String name);
    /**
     * 测试 url 传参
     *
     * @param id
     * @return
     */
    @GetMapping("testUrlParam/{id}")
    public BaseResult testUrlParam(@PathVariable("id") Integer id);
}
