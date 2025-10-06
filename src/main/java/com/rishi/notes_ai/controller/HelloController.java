package com.rishi.notes_ai.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
@RestController
public class HelloController {
    @GetMapping("/hello")
    /*public String sayHello(){
        return "Hello Iam Rishi! learning Springboot!";
    }*/
   public Map<String,String> sayHello(){
       Map<String,String> response=new HashMap<>();
       response.put("message","Hello Iam Rishikess,Iam learning Springboot!");
       return response;
    }
}
