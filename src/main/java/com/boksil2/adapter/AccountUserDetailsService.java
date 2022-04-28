package com.boksil2.adapter;

import com.boksil2.adapter.security.UserDetailService;
import com.boksil2.adapter.security.UserDetails;

public class AccountUserDetailsService implements UserDetailService {

    AccountService accountService;

    public AccountUserDetailsService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String username) {
        Account account = accountService.findAccountByUserName(username);
        return new AccountUserDetails(account);
    }
}
