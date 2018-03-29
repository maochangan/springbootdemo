package net.zgysrc.zb.controller;


import net.zgysrc.zb.service.TestService;
import net.zgysrc.zb.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "*" , maxAge = 3600)
@RestController
@RequestMapping(value = "testController")
public class TestController {

    @Autowired
    private TestService testSrevice;

    @RequestMapping(value = "getAllUser" , method = RequestMethod.GET)
    public JsonResult getAllUser(){
        List<Map<String , Object>> list = testSrevice.getAllUser();
        if(null == list){
            return JsonResult.fail().add("msg" , "无信息！");
        }else{
            return JsonResult.success().add("list", list);
        }
    }

    @RequestMapping(value = "getUserById" , method = RequestMethod.GET)
    public JsonResult getUserById(Integer id){
        System.out.println(id);
        Map<String , Object> map = testSrevice.getUserById(id);
        if (map == null) {
            return JsonResult.fail().add("msg", "无信息！");
        }else{
            return JsonResult.success().add("map", map);
        }

    }



}
