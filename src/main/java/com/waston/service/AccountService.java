package com.waston.service;

import com.waston.domain.Account;

import java.util.List;

public interface AccountService {
    //查询所有账户
    List<Account> findAll();
    //保存账户信息
    void saveAccount(Account account);
}
