package com.boksil2.adapter.security;

public interface UserDetailService {
    UserDetails loadUser(String username);
}
