package com.spring.cloud.config.client.controller;

import com.spring.cloud.config.client.service.ConfigDynamicService;
import com.spring.cloud.config.client.service.ConfigStaticService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CloudConfigController {

    private final ConfigStaticService configStaticService;
    private final ConfigDynamicService configDynamicService;

    /**
     * http://localhost:8080/static
     */
    @GetMapping(value = "/static")
    public Object getStatic() {
        return configStaticService.getConfig();
    }

    /**
     * https://elfinlas.github.io/2019/06/25/spring-config-refresh/
     * http://localhost:8080/dynamic
     */
    @GetMapping(value = "/dynamic")
    public Object getDynamic() {
        return configDynamicService.getConfig();
    }

}
