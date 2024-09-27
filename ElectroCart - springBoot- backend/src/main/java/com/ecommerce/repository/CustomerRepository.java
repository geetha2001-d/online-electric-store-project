package com.ecommerce.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.entity.Customer;



@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{
	Optional<Customer> findByEmailIDAndPassword(String emailID,String password);
	Optional<Customer> findByEmailID(String emailID);

}