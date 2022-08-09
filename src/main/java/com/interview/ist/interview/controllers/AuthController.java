package com.interview.ist.interview.controllers;

import com.interview.ist.interview.domain.dto.request.LoginRequest;
import com.interview.ist.interview.domain.dto.request.SignUpRequest;
import com.interview.ist.interview.services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    AuthService authService;

    @ResponseBody
    @PostMapping(value = "/signup")
    public ResponseEntity<?> signUpuser(@Valid @RequestBody SignUpRequest signUpRequest) {
        return authService.signup(signUpRequest);
    }

    @ResponseBody
    @PostMapping(value = "/login")
    public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {
        return authService.login(loginRequest);
    }

    @ResponseBody
    @PostMapping(value = "/logout")
    public ResponseEntity<?> logout() {
        return authService.logout();
    }
}
