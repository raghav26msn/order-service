package com.layoff.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.access.prepost.PreAuthorize;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @GetMapping("/{id}")
    public String getOrder(@PathVariable Long id) {
        return "Order details for Id: " + id;
    }

    @GetMapping("/security/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public String getOrderWithSecurity(@PathVariable Long id) {
        return "Security implemented for Id: " + id;
    }
}

