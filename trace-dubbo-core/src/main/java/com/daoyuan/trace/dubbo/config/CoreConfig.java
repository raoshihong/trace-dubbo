package com.daoyuan.trace.dubbo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(locations = "classpath*:dubbo/dubbo-consumer.xml")
@ComponentScan(basePackages = {"com.daoyuan.trace.client"})
public class CoreConfig {
}
