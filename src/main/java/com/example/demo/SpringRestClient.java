package com.example.demo;

import org.springframework.web.client.RestTemplate;

public class SpringRestClient {
    private static RestTemplate restTemplate = new RestTemplate();
    private static final String baseURL = "http://localhost:8888/persons/1";
}
