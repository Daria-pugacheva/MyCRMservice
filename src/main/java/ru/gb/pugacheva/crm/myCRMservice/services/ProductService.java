package ru.gb.pugacheva.crm.myCRMservice.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gb.pugacheva.crm.myCRMservice.entities.Product;
import ru.gb.pugacheva.crm.myCRMservice.repositories.ProductRepository;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public Product findById(Long productId) {
        return productRepository.findById(productId).get();
    }
}
