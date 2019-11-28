package com.kdgboys.HTF.Controller;

import com.kdgboys.HTF.model.AccountDto;
import com.kdgboys.HTF.model.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AccountController {

    private static Page<AccountDto[]> getJson()
    {
        RestTemplate restTemplate = new RestTemplate();
        Page<AccountDto> account = new Page<>();
        String url
                = "http://vault.bewire.org/accounts";
        ResponseEntity<Page<AccountDto[]>> response
                = restTemplate.getForEntity(url, (Class<Page<AccountDto[]>>)account.getClass());
        return response.getBody();
    }

    @GetMapping(value = "/account")
    public Page account() {
        return getJson();
    }
}