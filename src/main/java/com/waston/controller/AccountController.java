package com.waston.controller;

import com.waston.domain.Account;
import com.waston.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 账号web
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("findAll")
    public String findAll(Model model){
        System.out.println("表现层：查询所有账户...");
        //调用service方法
        List<Account> list = accountService.findAll();
        model.addAttribute("list", list);
        return "list";
    }
}
