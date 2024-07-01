package com.apispring.project.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.apispring.project.Entites.Account;


@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

    List<Account> findAll();
    Optional<Account> findById(Long id);
    @SuppressWarnings("unchecked")
    Account save(Account account);
    void deleteById (Long accountID);
 
}