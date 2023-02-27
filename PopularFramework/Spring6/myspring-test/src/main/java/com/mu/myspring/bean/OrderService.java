package com.mu.myspring.bean;

/**
 * @author : MUZUKI
 * @date : 2023-02-22 19:52
 **/

public class OrderService {
    private OrderDao orderDao;

    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    public void generate(){
        orderDao.insert();
    }
}
