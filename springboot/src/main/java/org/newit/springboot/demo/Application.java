package org.newit.springboot.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@SpringBootApplication
@Controller
public class Application {
    @Value("${newit.user.name}")
    private String myName;

    @Autowired
    private Books book;

    @RequestMapping("/book")
    @ResponseBody
    public Books getBook() {
        return book;
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello world";
    }

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/myname")
    @ResponseBody
    public String myName() {
        return myName;
    }


    @Value("${org.newit.environment}")
    private String environment;
    @RequestMapping("/environment")
    @ResponseBody
    public String getEnvironment(){
        return environment;
    }
}
