package com.apispring.project.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apispring.project.Entites.Account;
import com.apispring.project.Service.Interfaces.AccountInterface;
import com.apispring.project.repository.AccountRepository;

@Service
public class AccountService implements AccountInterface{
    @Autowired
    private AccountRepository accountRepository;

    @Override
    public List<Account> getAll() {
         return accountRepository.findAll();
    }

    @Override
    public Account saveAccount(Account account) {

        return accountRepository.save(account);
    }

    @Override
    public Account updateAccount(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public Optional<Account> getById(Long id) {
        return accountRepository.findById(id);
    }

 
}
