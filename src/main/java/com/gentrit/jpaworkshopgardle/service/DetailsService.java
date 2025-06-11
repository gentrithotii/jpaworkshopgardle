package com.gentrit.jpaworkshopgardle.service;

import com.gentrit.jpaworkshopgardle.entity.Details;
import org.springframework.data.repository.CrudRepository;

public interface DetailsService extends CrudRepository<Details, Long>{
}
