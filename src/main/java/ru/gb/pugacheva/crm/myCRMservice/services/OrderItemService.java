package ru.gb.pugacheva.crm.myCRMservice.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gb.pugacheva.crm.myCRMservice.entities.OrderItem;
import ru.gb.pugacheva.crm.myCRMservice.entities.Product;
import ru.gb.pugacheva.crm.myCRMservice.repositories.OrderItemRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderItemService {
    private final OrderItemRepository orderItemRepository;

    public List<OrderItem> findAllByProduct(Product product) {
        return orderItemRepository.findAllByProduct(product);
    }


}
