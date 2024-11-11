package com.userservicebff.userservicebff.controllers;

import com.userservicebff.userservicebff.model.LoginRequest;
import com.userservicebff.userservicebff.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/v1/take_a_guide/user")

public class UserServiceBffController {


    //CRUD
    @Autowired
    private RestTemplate restTemplate;

    @PutMapping("/change")
    public ResponseEntity<?> changeUser(@RequestBody User user) {
        String url = "https://user-service-take-a-guide.azurewebsites.net/api/v1/take_a_guide/user/change";
        ResponseEntity<?> response = restTemplate.exchange(url, HttpMethod.PUT, new HttpEntity<>(user), Object.class);
        return response;
    }

    @PostMapping("/retrieve")
    public ResponseEntity<?> retrieveUsers(@RequestBody User user) {
        String url = "https://user-service-take-a-guide.azurewebsites.net/api/v1/take_a_guide/user/retrieve";
        ResponseEntity<?> response = restTemplate.postForEntity(url, user, Object.class);
        return response;
    }


    @PostMapping("/create")
    public ResponseEntity<?> createUser(@RequestBody User user) {
        String url = "https://user-service-take-a-guide.azurewebsites.net/api/v1/take_a_guide/user/create";
        ResponseEntity<?> response = restTemplate.postForEntity(url, user, Object.class);
        return response;
    }

    @DeleteMapping("/remove")
    public ResponseEntity<?> removeUser(@RequestBody User user) {
        String url = "https://user-service-take-a-guide.azurewebsites.net/api/v1/take_a_guide/user/remove";
        ResponseEntity<?> response = restTemplate.exchange(url, HttpMethod.DELETE, new HttpEntity<>(user), Object.class);
        return response;
    }

    //auth

    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody LoginRequest request) {
        String url = "https://user-service-take-a-guide.azurewebsites.net/api/v1/take_a_guide/user/login";
        ResponseEntity<?> response = restTemplate.postForEntity(url, request, Object.class);
        return response;
    }

}