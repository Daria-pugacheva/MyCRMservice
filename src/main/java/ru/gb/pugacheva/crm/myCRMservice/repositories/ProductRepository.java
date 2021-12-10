package ru.gb.pugacheva.crm.myCRMservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.gb.pugacheva.crm.myCRMservice.entities.Product;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    //Optional<Product> findById (Long id);

}
