/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.outbottle.springsecurityexample;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DefaultController {
    
    
    @RequestMapping("/") //the url which will result in this method being invoked
    public String index(ModelMap map) {
        //ModelMap is one of several parameters which Spring will pass in
        //All that's required is to include it as so.
        map.addAttribute("message", "This is index Page");
        return "index"; //the name of the view
    }
    
    
    @Secured("ROLE_ADMIN")
    @RequestMapping("/adminpage")
    public String adminStuff(ModelMap map) {
        map.addAttribute("message", "This is Admin Page");
        return "index"; //the name of the view
    }
    
    
    @RequestMapping("/accessdenied")
    public String denied() {
        return "accessdenied"; //the name of the view
    }
}
