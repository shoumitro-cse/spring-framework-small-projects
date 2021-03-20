/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javatpoint.controller;

import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.RequestMapping;  
/**
 *
 * @author shoumitro
 */

@Controller  
public class HelloWorldController {  
    @RequestMapping("/hello")  
    public String helloWorld(Model m) {  
        String message = "Hello World, Spring MVC @ Javatpoint";  
        m.addAttribute("message", message);  
        return "hello";   
    }  
}  