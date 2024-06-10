package customer.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import customer.api.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
  
}
