package com.ruijie.pay.configuration;

import com.ruijie.pay.domain.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HttpClientConfiguration {

    private static final Logger LOG = LoggerFactory.getLogger(HttpClientConfiguration.class);

    @Bean
    public Order getOrder(){
        LOG.info("system order init");
        Order order = new Order();
        order.setMerchNo("system_order");
        return order;
    }
}
