package org.example.bean;

import org.springframework.stereotype.Component;

@Component
public class SpringBean {
    public SpringBean(){
        System.out.println("Spring bean object created");
    }
    public void testBean(){
        System.out.println("test method");
    }
}
