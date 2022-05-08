package com.mu.service;

import com.mu.domain.Account;

import java.util.List;

public interface AccountService {
    void save(Account account);

    void delete(Integer id);

    void updata(Account account);

    List<Account> findAll();

    Account findById(Integer id);
}
