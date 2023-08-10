package org.wrj.demo.config;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.wrj.config.BaseSwaggerConfig;
import org.wrj.domain.SwaggerProperties;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {


    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("org.wrj.demo.controller")
                .title("alvin-mall-demo")
                .description("demo apis")
                .version("1.0")
                .enableSecurity(false)
                .build()
                ;
    }

    @Bean
    public BeanPostProcessor springfoxHandlerProviderBeanPostProcessor(){
        return generateBeanPostProcessor();
    }
}
