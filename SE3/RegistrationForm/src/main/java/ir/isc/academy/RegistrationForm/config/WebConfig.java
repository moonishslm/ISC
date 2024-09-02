package ir.isc.academy.RegistrationForm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;


@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Bean
    ViewResolver viewResolver() {
        final InternalResourceViewResolver bean = new InternalResourceViewResolver();
        bean.setViewClass(JstlView.class);
        bean.setPrefix("/");
        bean.setSuffix(".jsp");
        bean.setOrder(2);
        return bean;
    }

    @Bean
    View registerform() {
        return new JstlView("/register.jsp");
    }

    @Bean
    View result() {
        return new JstlView("/result.jsp");
    }
}