package com.tricon.travisexample.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TravisController {

    @GetMapping("/get")
    @ResponseBody
    public String getExample(){
        return "Hello World with Travis v2";
    }
}
