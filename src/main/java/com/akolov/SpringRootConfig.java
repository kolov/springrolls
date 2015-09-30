package com.akolov;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@ComponentScan({"com.akolov"})
public class SpringRootConfig extends WebMvcConfigurerAdapter {


}