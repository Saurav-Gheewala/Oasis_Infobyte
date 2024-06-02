package com.oasis.ATM.repository;

import com.oasis.ATM.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User , Long> {
    public User findByAccountNumber(String accountNumber);
    public Boolean existsByAccountNumber(String accountNumber);
}
