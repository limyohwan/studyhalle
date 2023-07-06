package com.yohwan.study.annotation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Hello
@RestController
public class HelloController {
    private static final String STATIC_FINAL_HELLO = "/hello";
    private static String staticHello = "/hello";
    private final String finalHello = "/hello";
    private String hello = "/hello";
    private String privateName;
    public String publicName;
    
    @GetMapping(STATIC_FINAL_HELLO)
    public String hello() {
        return "hello";
    }

//    @GetMapping(staticHello) // 컴파일 에러 Attribute value must be constant
//    public String hello2() {
//        return "hello";
//    }

    @GetMapping(finalHello)
    public String hello3() {
        return "hello";
    }

//    @GetMapping(hello) // 컴파일 에러 Attribute value must be constant
//    public String hello4() {
//        return "hello";
//    }
}
