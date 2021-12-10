package ru.gb.pugacheva.crm.myCRMservice.controllers;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.gb.pugacheva.crm.myCRMservice.dtos.OrderDto;
import ru.gb.pugacheva.crm.myCRMservice.services.OrderService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/orders")
public class OrderController {
    private final OrderService orderService;

    @GetMapping("/{price}")
    public List<OrderDto> findAllByTotalPriceMoreThan(@PathVariable int price) {
        return orderService.findAllByTotalPriceMoreThan(price);
    }
}
