package com.ruijie.pay.controller;

import com.ruijie.pay.configuration.HttpClientConfiguration;
import com.ruijie.pay.model.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    private static final Logger LOG = LoggerFactory.getLogger(IndexController.class);

    @Autowired
    private Order order;

    @GetMapping("/index")
    String home() {
        LOG.info("order info : {}", order);
        return "Hello World!";
    }
}
