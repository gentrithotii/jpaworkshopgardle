package com.gentrit.jpaworkshopgardle.service.impl;

import com.gentrit.jpaworkshopgardle.repository.AppUserRepository;
import com.gentrit.jpaworkshopgardle.service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppUserServiceImpl implements AppUserService {
    private AppUserRepository appUserRepository;

    @Autowired
    public AppUserServiceImpl(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }
}
