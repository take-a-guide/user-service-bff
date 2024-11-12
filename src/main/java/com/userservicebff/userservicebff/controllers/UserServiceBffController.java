package com.userservicebff.userservicebff.controllers;

import com.userservicebff.userservicebff.dtos.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/api/v1/take_a_guide/user")
public class UserServiceBffController {

    private static final Logger logger = LoggerFactory.getLogger(UserServiceBffController.class);

    @Autowired
    private RestTemplate restTemplate;

    @PutMapping("/change")
    public ResponseEntity<?> changeUser(@RequestBody ChangeUserRequest request) {
        String url = "https://user-service-container-app.greenbush-ca0d2b09.eastus.azurecontainerapps.io/api/v1/take_a_guide/user/change";
        ResponseEntity<?> response = restTemplate.exchange(url, HttpMethod.PUT, new HttpEntity<>(request), Object.class);
        return response;
    }

    @PostMapping("/retrieve")
    public ResponseEntity<?> retrieveUsers(@RequestBody RetrieveUserRequest user) {
        String url = "https://user-service-container-app.greenbush-ca0d2b09.eastus.azurecontainerapps.io/api/v1/take_a_guide/user/retrieve";
        ResponseEntity<?> response = restTemplate.postForEntity(url, user, Object.class);
        return response;
    }

    @PostMapping("/create")
    public ResponseEntity<?> createUser(@RequestBody CreateUserRequest request) {
        String url = "https://user-service-container-app.greenbush-ca0d2b09.eastus.azurecontainerapps.io/api/v1/take_a_guide/user/create";
        ResponseEntity<?> response = restTemplate.postForEntity(url, request, Object.class);
        return response;        
    }

    @DeleteMapping("/remove")
    public ResponseEntity<?> removeUser(@RequestBody DeleteUserRequest request) {
        String url = "https://user-service-container-app.greenbush-ca0d2b09.eastus.azurecontainerapps.io/api/v1/take_a_guide/user/remove";
        ResponseEntity<?> response = restTemplate.exchange(url, HttpMethod.DELETE, new HttpEntity<>(request), Object.class);
        return response;
    }
}