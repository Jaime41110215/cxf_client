
package com.cxf.server.service.hello2;


import com.cxf.server.service.HelloService;
import org.springframework.stereotype.Service;

//@Service("helloService")
public class HelloServiceImpl2 implements HelloService {

    public String sayHello(String a) {
        return "Hello2 " + a + ", Welcome to CXF RS Spring Boot World!!!";
    }
}
