package com.teste.jenkins.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/testejenkins")
public class TesteJenkinsResource {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> buscarPorId(){
        return ResponseEntity.ok().body("O teste de jenkins está correto! =D");
    }
}
