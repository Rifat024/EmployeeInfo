package com.example.JPA.joining.Reporsitory;

import com.example.JPA.joining.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
