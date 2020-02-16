package com.electricfox.skeleton.service;

import com.electricfox.skeleton.repository.BasicRepositoryImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;


class BasicServiceImplTest {

    private static final String MOCK_RESULT = "MOCK_RESULT";
    private static final String ANOTHER_MOCK_RESULT = "ANOTHER MOCK_RESULT";

    @Mock
    BasicRepositoryImpl mockRepo;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void basicServiceFunction() {
        //Arrange
        when(mockRepo.basicRepoFunction()).thenReturn(MOCK_RESULT);
        BasicService classUnderTest = new BasicServiceImpl(mockRepo);

        //Act
        String result = classUnderTest.basicServiceFunction();

        //Assert
        assertEquals(MOCK_RESULT, result, "Basic service function not behave as expected");
    }

    @Test
    void anotherBasicServiceFunction() {
        //Arrange
        when(mockRepo.anotherBasicRepoFunction()).thenReturn(ANOTHER_MOCK_RESULT);
        BasicService classUnderTest = new BasicServiceImpl(mockRepo);

        //Act
        String result = classUnderTest.anotherBasicServiceFunction();

        //Assert
        assertEquals(ANOTHER_MOCK_RESULT, result, "The other basic service function not behave as expected");
    }
}