package com.electricfox.skeleton.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class BasicControllerTest {

    private static final String BASIC_GREETING_ENDPOINT = "basic-greeting";
    private static final String EXPECTED_BASIC_GREETING = "This is a basic repo function";

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void getBasicGreeting() throws Exception {
        //Arrange
        String uri = String.format("http://localhost:%d/%s", port, BASIC_GREETING_ENDPOINT);

        //Act, Assert
        assertThat(this.restTemplate.getForObject(uri, String.class)).contains(EXPECTED_BASIC_GREETING);
    }
}