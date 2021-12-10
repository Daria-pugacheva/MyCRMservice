package ru.gb.pugacheva.crm.myCRMservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.gb.pugacheva.crm.myCRMservice.entities.Order;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    List<Order> findAllByTotalPriceIsGreaterThan(int totalPrice);

}
