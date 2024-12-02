package com.hasith.springbootecommerce.service;

import com.hasith.springbootecommerce.dto.Purchase;
import com.hasith.springbootecommerce.dto.PurchaseResponse;

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);
}
