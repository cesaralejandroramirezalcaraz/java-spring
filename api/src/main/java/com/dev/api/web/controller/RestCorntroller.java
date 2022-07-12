package com.dev.api.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludar")
public class RestCorntroller {
    @GetMapping("/hola")

    public String hola (){
        return("hola mundo  en mi app java ");
    }


}
