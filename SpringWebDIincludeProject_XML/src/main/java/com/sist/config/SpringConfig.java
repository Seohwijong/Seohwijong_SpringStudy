package com.sist.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
@ComponentScan(basePackages = {"com.sist.*"})
@MapperScan(basePackages = {"com.sist.mapper"})
public class SpringConfig implements WebMvcConfigurer{

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
	/*
			<servlet>
				<servlet-name>dispatcher</servlet-name>
				<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
					<init-param>
						<param-name>contextConfigLocation</param-name>
						<param-value>/WEB-INF/config/application-*.xml</param-value>
					</init-param>
			</servlet>
	 */
}
