package com.gentrit.jpaworkshopgardle.repository;

import com.gentrit.jpaworkshopgardle.entity.Details;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DetailsRepository extends CrudRepository<Details, Long> {

    Optional<Details> findDetailsByEmail(String email);

    List<Details> findDetailsByNameContains(String name);

    List<Details> findDetailsByNameIgnoreCase(String name);
}
