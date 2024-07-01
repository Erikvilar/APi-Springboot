package com.apispring.project.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
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
        System.out.println("Uma nova conta foi criada");
      
    
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

    @Override
    public ResponseEntity<String> deleteAccount(Long accountID){
      Optional<Account> Account = accountRepository.findById(accountID);
        if(Account.isPresent()){
            System.out.println("ID: "+accountID+":: Foi deletado");
          accountRepository.deleteById(accountID);
            return ResponseEntity.status(HttpStatus.OK).body("");
        }else{
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).body("");
        }
    }

  

 
}
