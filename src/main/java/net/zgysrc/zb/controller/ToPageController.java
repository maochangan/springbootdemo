package net.zgysrc.zb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;


@Controller
@RequestMapping(value = "/")
public class ToPageController {
//
//    @RequestMapping(value = "" , method = RequestMethod.GET)
//    public String firstPage(HttpSession session){
//        return "index";
//    }
//
//    
//    @RequestMapping(value = "login" , method = RequestMethod.GET)
//    public String firstPagea(HttpSession session){
//        String test = (String) session.getAttribute("test");
//        System.out.println(test.toString());
//        return "login";
//    }

}
