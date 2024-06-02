package com.oasis.ATM.controller;

import com.oasis.ATM.requestModel.AddRequest;
import com.oasis.ATM.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class AddController {
    @Autowired
    UserService userService;

    @PostMapping("/add")
    public ResponseEntity<Boolean> adduser(@RequestBody AddRequest addRequest) {

        return userService.addUsers(addRequest);
    }
}
