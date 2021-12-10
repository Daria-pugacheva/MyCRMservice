package ru.gb.pugacheva.crm.myCRMservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.gb.pugacheva.crm.myCRMservice.entities.Customer;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findAllByBirthDayAndAndBirthMonth(int day, int month);

}
