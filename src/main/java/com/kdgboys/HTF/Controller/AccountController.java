package com.kdgboys.HTF.Controller;

import com.kdgboys.HTF.model.AccountDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AccountController {

    private static AccountDto getJson()
    {
        RestTemplate restTemplate = new RestTemplate();
        String url
                = "http://vault.bewire.org/accounts/39831414-919b-4660-bb82-db1a043e8af2";
        ResponseEntity<AccountDto> response
                = restTemplate.getForEntity(url, AccountDto.class);
        return response.getBody();
    }

    @GetMapping(value = "/account")
    public AccountDto account() {
        return getJson();
    }
}