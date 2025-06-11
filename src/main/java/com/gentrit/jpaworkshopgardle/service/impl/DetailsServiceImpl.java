package com.gentrit.jpaworkshopgardle.service.impl;

import com.gentrit.jpaworkshopgardle.repository.DetailsRepository;
import com.gentrit.jpaworkshopgardle.service.DetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetailsServiceImpl implements DetailsService {
    private DetailsRepository detailsRepository;

    @Autowired
    public DetailsServiceImpl(DetailsRepository detailsRepository) {
        this.detailsRepository = detailsRepository;
    }

}
