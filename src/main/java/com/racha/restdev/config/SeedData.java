package com.racha.restdev.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.racha.restdev.model.Account;
import com.racha.restdev.service.AccountService;
import com.racha.restdev.util.constants.Authority;

@Component
public class SeedData implements CommandLineRunner {
    
    @Autowired
    private AccountService  accountService;


    @Override
    public void run(String... args) throws Exception {
        Account account01 = new Account();
        Account account02 = new Account();

        account01.setEmail("user@user.com");
        account01.setPassword("password");
        account01.setAuthorities(Authority.USER.toString());
        accountService.save(account01);
        
        account02.setEmail("admin@admin.com");
        account02.setPassword("password");
        account02.setAuthorities(Authority.ADMIN.toString() + " " + Authority.USER.toString());
        accountService.save(account02);

        
    }
}
