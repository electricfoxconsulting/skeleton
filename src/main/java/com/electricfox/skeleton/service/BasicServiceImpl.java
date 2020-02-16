package com.electricfox.skeleton.service;

import com.electricfox.skeleton.repository.BasicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BasicServiceImpl implements BasicService{

    BasicRepository basicRepository;

    @Autowired
    public BasicServiceImpl(BasicRepository basicRepository) {
        this.basicRepository = basicRepository;
    }

    @Override
    public String basicServiceFunction() {
        return basicRepository.basicRepoFunction();
    }

    @Override
    public String anotherBasicServiceFunction() {
        return basicRepository.anotherBasicRepoFunction();
    }
}
