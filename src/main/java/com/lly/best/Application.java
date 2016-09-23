package com.lly.best;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author cwx
 * @date 2016/09/22 14:08
 * And it’s as if I never really even knew love until right now, in this moment, with you.
 */
@Controller
@SpringBootApplication
@EnableTransactionManagement
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


    @Override
    protected SpringApplicationBuilder configure(
            SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

    @RequestMapping("/")
    public String home() {
        return "index";
    }

}
