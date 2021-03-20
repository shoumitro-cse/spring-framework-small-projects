/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author shoumitro
 */

@Controller
public class MyController {
    
    @RequestMapping("/about")
    public String homePage() {
        return "web_about/about";
    }
    
    @RequestMapping("/contact")
    public String loginPage() {
        return "web_about/contact";
    }

}
