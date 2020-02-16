package com.electricfox.skeleton.repository;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicRepositoryImplTest {

    private static final String EXPECTED_ANOTHER_BASIC_FUNCTION = "This is another basic repo function";
    private static final String EXPECTED_BASIC_FUNCTION = "This is a basic repo function";

    @Test
    void basicRepoFunction() {

        //Arrange
        BasicRepository classUnderTest = new BasicRepositoryImpl();

        //Act
        String result = classUnderTest.basicRepoFunction();

        //Assert
        assertEquals(EXPECTED_BASIC_FUNCTION, result,"The basic function was not as expected");
    }

    @Test
    void anotherBasicRepoFunction() {
        //Arrange
        BasicRepository classUnderTest = new BasicRepositoryImpl();

        //Act
        String result = classUnderTest.anotherBasicRepoFunction();

        //Assert
        assertEquals(EXPECTED_ANOTHER_BASIC_FUNCTION, result,"The other basic function was not as expected");
    }
}