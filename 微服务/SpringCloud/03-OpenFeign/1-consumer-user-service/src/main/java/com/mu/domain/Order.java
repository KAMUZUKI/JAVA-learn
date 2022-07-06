package com.mu.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author MUZUKI
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Order implements Serializable {
    private String orderSn;
    private String orderName;
    private String orderDetail;
    private Date orderTime;
    private String userId;
}
