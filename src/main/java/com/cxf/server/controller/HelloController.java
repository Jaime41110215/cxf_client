package com.cxf.server.controller;

import com.cxf.server.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wanghongchao
 * @mail wanghongchao@sinosoft.com.cn
 * @time 2019/1/24
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    HelloService helloService;

    @RequestMapping("/client")
    public String getHello(){
        String tom = helloService.sayHello("tom");
        return tom;
    }
}
