package ru.shopify.services;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.shopify.models.Account;
import ru.shopify.repositories.AccountsRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountsService {

    @Autowired
    private final AccountsRepository accountsRepository;

    public List<Account> getAllAccounts(){
        return accountsRepository.findAll();
    }

    public Account getAccountById(Integer id){
        return accountsRepository.findById(id).orElseThrow(()->new UsernameNotFoundException(""));
    }
}
