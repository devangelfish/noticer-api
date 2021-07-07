package com.jaebeom.noticer.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

import com.jaebeom.noticer.app.DBConfig;
import com.jaebeom.noticer.app.MyBatisConfig;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan({"com.jaebeom.noticer.service",
				"com.jaebeom.noticer.repository",
				"com.jaebeom.noticer.aspect"})
@Import({DBConfig.class, MyBatisConfig.class})
public class AppConfig {

}
