package com.interview.ist.interview.controllers;

import com.interview.ist.interview.domain.dto.request.SearchRequest;
import com.interview.ist.interview.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @ResponseBody
    @PostMapping(value = "/list")
    public ResponseEntity<Object> getSearchAllUser(@RequestBody SearchRequest searchRequest) {
        return userService.allUser(searchRequest);
    }
}
