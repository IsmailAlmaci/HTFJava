package com.kdgboys.HTF.Controller;

import com.kdgboys.HTF.model.AccountDto;
import com.kdgboys.HTF.model.Page;
import com.kdgboys.HTF.model.SolveAccountCommand;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AccountController {
    private static Page<AccountDto> getJson()
    {
        RestTemplate restTemplate = new RestTemplate();
        Page<AccountDto> account = new Page<>();
        String url
                = "http://vault.bewire.org/accounts";
        ResponseEntity<Page<AccountDto>> response
                = restTemplate.getForEntity(url, (Class<Page<AccountDto>>)account.getClass());
        return response.getBody();
    }

    private ArrayList<AccountDto> getChallenges()
    {
        return getJson().getContent();
    }

    public AccountDto post(String id, String answer)
    {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://vault.bewire.org/accounts/" + id;

        HttpEntity<SolveAccountCommand> request = new HttpEntity<>(new SolveAccountCommand(answer));
        AccountDto result = restTemplate.postForObject(url, request, AccountDto.class);
        return result;
    }

    @GetMapping(value ="/post")
    public AccountDto post()
    {
        return post("b1eaaa67-8e69-4ac4-bc56-98c6e9782f5e", "pudfriueshq");
    }

    @GetMapping(value = "/challenges")
    public ArrayList<String> challenges()
    {
        ArrayList<String> list = new ArrayList<>();
        for (AccountDto account : getChallenges()) {
            list.add(account.getChallenge());
        }
        return list;
    }

    @GetMapping(value = "/account")
    public List<AccountDto> account() {
        return getChallenges();
    }
}