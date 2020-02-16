package com.electricfox.skeleton.repository;

import org.springframework.stereotype.Service;

@Service
public class BasicRepositoryImpl implements BasicRepository {

    private static final String ANOTHER_BASIC_REPO_FUNCTION = "This is another basic repo function";
    private static final String BASIC_REPO_FUNCTION = "This is a basic repo function";

    @Override
    public String basicRepoFunction() {
        return BASIC_REPO_FUNCTION;
    }

    @Override
    public String anotherBasicRepoFunction() {
        return ANOTHER_BASIC_REPO_FUNCTION;
    }
}
