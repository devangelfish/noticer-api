package com.jaebeom.noticer.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

import com.jaebeom.noticer.web.MvcConfig;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan({"com.jaebeom.noticer.controller",
				"com.jaebeom.noticer.exception",
				"com.jaebeom.noticer.service"})
@Import({MvcConfig.class})
public class WebConfig {

}
