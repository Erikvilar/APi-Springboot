package com.apispring.project.Service.Interfaces;

import java.util.List;
import java.util.Optional;

import com.apispring.project.Entites.Account;

public interface  AccountInterface {
    List <Account> getAll();
    Optional <Account> getById(Long id);
    Account saveAccount (Account account);
    Account updateAccount (Account account);
}
