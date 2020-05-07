package com.hackerone.lookermock.controller.look;

import com.hackerone.lookermock.exception.UnauthorizedAccessException;
import com.hackerone.lookermock.util.CsvReader;
import com.hackerone.lookermock.util.TokenManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;

@RestController
public class LooksController {

    @GetMapping(path = "/api/3.1/looks/{lookId}/run/{resultFormat}")
    public String getLook(@PathVariable String lookId, @PathVariable String resultFormat, @RequestHeader("Authorization") String authToken) throws FileNotFoundException {
        if (!authToken.split(" ")[1].equals(TokenManager.getActiveToken())) {
            throw new UnauthorizedAccessException("Invalid token");
        }
        return CsvReader.readCsv();
    }
}
