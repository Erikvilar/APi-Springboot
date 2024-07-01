package com.apispring.project.Service.Interfaces;

import java.util.List;
import java.util.Optional;



import org.springframework.http.ResponseEntity;

import com.apispring.project.Entites.Account;

public interface  AccountInterface {
    List <Account> getAll();
    Optional <Account> getById(Long id);
    Account saveAccount (Account account);
    Account updateAccount (Account account);
   ResponseEntity<String> deleteAccount (Long accountID) ;

    //Account save with person

}
