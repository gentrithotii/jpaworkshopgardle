package com.gentrit.jpaworkshopgardle.repository;

import com.gentrit.jpaworkshopgardle.entity.AppUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Optional;

@Repository
public interface AppUserRepository extends CrudRepository<AppUser, Long> {
    Optional<AppUser> findAppUserByUsername(String username);

    Collection<AppUser> findAppUserByRegDateBetween(LocalDate regDateAfter, LocalDate regDateBefore);

    Optional<AppUser> findAppUserByUserDetails_Id(long userDetailsId);

    Optional<AppUser> findAppUserByUserDetails_EmailIgnoreCase(String userDetailsEmail);

}
