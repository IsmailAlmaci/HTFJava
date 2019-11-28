package com.kdgboys.HTF.Controller;

import com.kdgboys.HTF.model.AccountDto;
import com.kdgboys.HTF.model.Page;
import com.kdgboys.HTF.model.SolveAccountCommand;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import static com.sun.org.apache.xerces.internal.util.PropertyState.is;

@RestController
public class AccountController {

    private static Page<AccountDto[]> getJson()
    {
        RestTemplate restTemplate = new RestTemplate();
        Page<AccountDto[]> account = new Page<>();
        String url
                = "http://vault.bewire.org/accounts";
        ResponseEntity<Page<AccountDto[]>> response
                = restTemplate.getForEntity(url, (Class<Page<AccountDto[]>>)account.getClass());
        return response.getBody();
    }

    private String getUrl()
    {
        return "http://vault.bewire.org/accounts" + getJson().getContent()[0].getId();
    }

    private AccountDto getAccount(String url)
    {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<AccountDto> response
                = restTemplate.getForEntity(url, AccountDto.class);
        return response.getBody();
    }

    public AccountDto post()
    {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://vault.bewire.org/accounts/9e02c842-6162-4827-8d04-64f9649d4133";

        HttpEntity<SolveAccountCommand> request = new HttpEntity<>(new SolveAccountCommand("zfscacsrzayzhx"));
        AccountDto answer = restTemplate.postForObject(url, request, AccountDto.class);
        return answer;
    }

    @GetMapping(value = "/account")
    public AccountDto account() {
        return post();
    }
}