package io.freshgravity.arcsjobs.config;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "io.freshgravity.arcsjobs")
public class FeignConfiguration {

}
