package com.spring.cloud.config.client.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@RefreshScope
public class ConfigDynamicService {
    @Value("${server.port}")
    private int port;
    @Value("${spring.application.name}")
    private String name;

    @Value("${message.one}")
    private String one;

    @Value("${message.two}")
    private String two;

    @Value("${message.config}")
    private String config;

    public Map<String, Object> getConfig() {
        Map<String, Object> map = new HashMap<>();
        map.put("port", port);
        map.put("name", name);
        map.put("dynamic", "dynamic");
        map.put("one", one);
        map.put("two", two);
        map.put("config", config);
        return map;
    }
}
