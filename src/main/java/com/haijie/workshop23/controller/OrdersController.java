package com.haijie.workshop23.controller;

import javax.xml.transform.Result;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.haijie.workshop23.models.Order;
import com.haijie.workshop23.services.OrderService;

@Controller
@RequestMapping("")
public class OrdersController {
    
    @Autowired
    OrderService osvc;

    @GetMapping("/order/total/{id}")
    public String getTotalPrice(@PathVariable int id,Model model){
        Order o = osvc.getTotalPrice(id);
        model.addAttribute("order",o);
        System.out.println(o.getId());
        System.out.println(o.getOrderDate());
        System.out.println(o.getCustomerId());
        System.out.println(o.getTotalPrice());
        System.out.println(o.getCostPrice());

        return "result";
    }

}
