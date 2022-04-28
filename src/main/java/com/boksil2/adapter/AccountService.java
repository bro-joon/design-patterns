package com.boksil2.adapter;

import com.boksil2.adapter.security.UserDetailService;
import com.boksil2.adapter.security.UserDetails;

public class AccountService implements UserDetailService {

    public Account findAccountByUserName(String userName) {
        Account account = new Account();
        account.setName(userName);
        account.setPassword(userName);
        account.setEmail(userName);
        return account;
    }

    public void createNewAccount(Account account) {

    }

    public void updateAccount(Account account){

    }

    @Override
    public UserDetails loadUser(String username) {
        return findAccountByUserName(username);
    }
}
