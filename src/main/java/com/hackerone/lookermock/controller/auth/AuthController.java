package com.hackerone.lookermock.controller.auth;

import com.hackerone.lookermock.model.AuthResponse;
import com.hackerone.lookermock.util.TokenManager;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

@RestController
public class AuthController {

    @Value("${api.token.expiry.interval.in.milliseconds}")
    private long expiryInterval;

    @PostMapping(path = "/api/3.1/login")
    public AuthResponse getToken(@RequestBody String client_id, @RequestBody String client_secret) throws FileNotFoundException {

        return new AuthResponse(TokenManager.getActiveToken(), "token", String.valueOf(TimeUnit.MILLISECONDS.toSeconds((expiryInterval))));
    }
}
