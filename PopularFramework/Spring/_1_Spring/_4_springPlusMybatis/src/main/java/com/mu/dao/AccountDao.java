package com.mu.dao;

import com.mu.domain.Account;

import java.util.List;

public interface AccountDao {

    void save(Account account);

    void delete(Integer id);

    void updata(Account account);

    List<Account> findAll();

    Account findById(Integer id);
}
