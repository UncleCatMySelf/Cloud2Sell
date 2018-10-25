package com.myself.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by MySelf on 2018/10/24.
 */
@RestController
public class ServerController {

    @GetMapping("/msg")
    public String msg(){
        return "this is product' msg";
    }

}
