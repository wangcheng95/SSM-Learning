package com.waston.dao;

import com.waston.domain.Account;

import java.util.List;

/**
 * 账号DAO接口
 */
public interface AccountDao {
    //查询所有账户
    List<Account> findAll();
    //保存账户信息
    void saveAccount(Account account);
}
