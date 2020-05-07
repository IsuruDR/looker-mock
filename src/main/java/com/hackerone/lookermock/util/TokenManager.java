package com.hackerone.lookermock.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.security.SecureRandom;

@Component
public class TokenManager {

    @Value("${api.token.expiry.interval.in.milliseconds}")
    private long expiryInterval;

    private static String activeToken;

    @Value("${api.tokens}")
    private String[] tokens;

    protected static SecureRandom random = new SecureRandom();

    public static synchronized String generateToken(String username) {
        long longToken = Math.abs(random.nextLong());
        String random = Long.toString(longToken, 16);
        return (username + ":" + random);
    }

    public static String getActiveToken() {

        return activeToken;
    }

    @Scheduled(fixedDelayString = "${api.token.expiry.interval.in.milliseconds}")
    public void setActiveApiToken() {
        int nextTokenPosition = random.nextInt(tokens.length - 1);
        activeToken = tokens[nextTokenPosition];
    }

}
