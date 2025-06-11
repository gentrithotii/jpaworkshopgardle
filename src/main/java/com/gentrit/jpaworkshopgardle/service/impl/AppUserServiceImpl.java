package com.gentrit.jpaworkshopgardle.service.impl;

import com.gentrit.jpaworkshopgardle.entity.AppUser;
import com.gentrit.jpaworkshopgardle.repository.AppUserRepository;
import com.gentrit.jpaworkshopgardle.service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class AppUserServiceImpl implements AppUserService {
    private AppUserRepository appUserRepository;

    @Autowired
    public AppUserServiceImpl(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }

    @Override
    public AppUser saveAppUser(AppUser appUser) {
        return appUserRepository.save(appUser);
    }

    @Override
    public Optional<AppUser> findAppUserById(long id) {
        return appUserRepository.findAppUserById(id);
    }

    @Override
    public Optional<AppUser> findAppUserByUsername(String username) {
        return appUserRepository.findAppUserByUsername(username);
    }

    @Override
    public List<AppUser> findAppUserByRegDateBetween(LocalDate fromDate, LocalDate toDate) {
        return appUserRepository.findAppUserByRegDateBetween(fromDate, toDate);
    }

    @Override
    public Optional<AppUser> findAppUserByEmail(String email) {
        return appUserRepository.findAppUserByUserDetails_EmailIgnoreCase(email);
    }
}
