package com.example.test;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc   //启用SpringMVC
@ComponentScan("com.example.controller")
public class WebConfig extends WebMvcConfigurerAdapter {



}
