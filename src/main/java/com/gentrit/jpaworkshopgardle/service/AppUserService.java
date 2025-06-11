package com.gentrit.jpaworkshopgardle.service;

import com.gentrit.jpaworkshopgardle.entity.AppUser;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface AppUserService {
    AppUser saveAppUser(AppUser appUser);

    Optional<AppUser> findAppUserById(long id);

    Optional<AppUser> findAppUserByUsername(String username);

    List<AppUser> findAppUserByRegDateBetween(LocalDate fromDate, LocalDate toDate);

    Optional<AppUser> findAppUserByEmail(String email);

}
