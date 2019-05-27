package com.endava.soj.testing1.controller;

import com.endava.soj.testing1.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Endpoint;

@RestController
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @RequestMapping(path = "/test", method = RequestMethod.GET)
    private String testEndpoint() {
        return "I'm ok";
    }
}
