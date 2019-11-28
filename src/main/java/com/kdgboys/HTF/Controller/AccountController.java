package com.kdgboys.HTF.Controller;

import com.kdgboys.HTF.model.AccountDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AccountController {

    private static AccountDto[] getJson()
    {
        RestTemplate restTemplate = new RestTemplate();
        String url
                = "http://vault.bewire.org/accounts";
        ResponseEntity<AccountDto[]> response
                = restTemplate.getForEntity(url, AccountDto[].class);
        return response.getBody();
    }

    @GetMapping(value = "/account")
    public AccountDto account() {
        return getJson()[0];
    }
}