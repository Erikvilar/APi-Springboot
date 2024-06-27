package com.apispring.project.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.apispring.project.Entites.Account;
import com.apispring.project.Service.AccountService;


import jakarta.validation.Valid;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/account")
public class AccountController{

    @Autowired
    private AccountService eService;
    
    @GetMapping("/return")
    public ResponseEntity<List<Account>> getMethodName() {
        return new ResponseEntity<>(eService.getAll(),  HttpStatus.OK);
    }
    @GetMapping("/return/{id}")
    public ResponseEntity<Optional<Account>> getMethodName(@PathVariable Long  id) {
        return new ResponseEntity<>(eService.getById(id),  HttpStatus.OK);
    }
    @PostMapping("/save")
    public ResponseEntity<Account> saveValues(@Valid @RequestBody Account account) {
        return new ResponseEntity<>(eService.saveAccount(account), HttpStatus.OK);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<Account> updateValues(@PathVariable Long id , @RequestBody Account account) {
        account.setAccountID(id);
        return new ResponseEntity<>(eService.saveAccount(account), HttpStatus.OK);
    }
    
    
    
}