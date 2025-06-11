package com.gentrit.jpaworkshopgardle.service;

import com.gentrit.jpaworkshopgardle.entity.AppUser;
import org.springframework.data.repository.CrudRepository;

public interface AppUserService extends CrudRepository<AppUser, Long> {
}
