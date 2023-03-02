package com.haijie.workshop23.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haijie.workshop23.models.Order;
import com.haijie.workshop23.repositories.OrderRepo;

@Service
public class OrderService {
    
    @Autowired
    OrderRepo orp;

    public Order getTotalPrice(int id){
        return orp.getTotalPrice(id);
    }
}
