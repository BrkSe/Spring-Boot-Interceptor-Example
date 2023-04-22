package com.burakkutbay.springbootinterceptorexample.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    Logger LOG = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/")
    public String executeLogger() {
        LOG.info("Inside Controller");
        return "Hello World";
    }
}

