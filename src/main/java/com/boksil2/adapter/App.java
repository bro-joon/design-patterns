package com.boksil2.adapter;

import com.boksil2.adapter.security.LoginHandler;
import com.boksil2.adapter.security.UserDetailService;

public class App {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        UserDetailService userDetailService = new AccountUserDetailsService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailService);
        String login = loginHandler.login("keesun", "keesun");
        System.out.println(login);
    }
}
