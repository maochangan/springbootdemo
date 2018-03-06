package net.zgysrc.zb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"net.zgysrc.zb.controller", "net.zgysrc.zb.service", "net.zgysrc.zb.util"})
@MapperScan(basePackages = "net.zgysrc.zb.dao")
@EnableAutoConfiguration
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
