package com.hbu.live.anchor.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/anchors")
public class AnchorController {
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity getUser(){
        return  ResponseEntity.ok().body("真棒，看到这个，说明anchor模块接口调通");
    }
}
