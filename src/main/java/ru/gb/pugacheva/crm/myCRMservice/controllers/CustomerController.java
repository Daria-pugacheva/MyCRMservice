package ru.gb.pugacheva.crm.myCRMservice.controllers;

import lombok.RequiredArgsConstructor;
import org.hibernate.query.criteria.internal.expression.function.CurrentDateFunction;
import org.hibernate.type.LocalDateType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.gb.pugacheva.crm.myCRMservice.dtos.CustomerDto;
import ru.gb.pugacheva.crm.myCRMservice.services.CustomerService;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/v1/customers")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;

    @GetMapping("/birthday")
    public List<CustomerDto> findAlByBirthday() {
        LocalDate date = LocalDate.now();
        int day = date.getDayOfMonth();
        int month = date.getMonthValue();
        return customerService.findAllByBirthday(day, month);
    }

    @GetMapping("/{productId}")
    public List<CustomerDto> findAlByProductId(@PathVariable Long productId) {
        return customerService.findAllByProductId(productId);
    }


}
