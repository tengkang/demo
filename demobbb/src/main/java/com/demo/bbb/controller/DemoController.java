package com.demo.bbb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tengkang
 * @date 2023/9/11 3:55
 * @desc please describe this project simply
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/aaa")
    public String aaa() {
        return "aaaaaaaa";
    }

    @GetMapping("/bbb")
    public String bbb() {
        return "xxxx";
    }

    @GetMapping("/ccc")
    public String ccc() {
        return "ccccc";
    }


}
