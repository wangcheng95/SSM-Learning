package com.waston.dao;

import com.waston.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 账号DAO接口
 */
public interface AccountDao {
    //查询所有账户
    @Select("select * from account")
    List<Account> findAll();
    //保存账户信息
    @Insert("insert into account (name,money) values (#{name}, #{money})")
    void saveAccount(Account account);
}
