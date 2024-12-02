package com.hasith.springbootecommerce.dto;

import com.hasith.springbootecommerce.entity.Address;
import com.hasith.springbootecommerce.entity.Customer;
import com.hasith.springbootecommerce.entity.Order;
import com.hasith.springbootecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
