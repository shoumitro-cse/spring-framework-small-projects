package com.javatpoint;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//spring-servlet
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String display(@RequestParam("name") String n, @RequestParam("pass") String p, Model m) {

        if (p.equals("admin")) {
            String msg = "Hello " + n;
            //add a message to the model  
            m.addAttribute("message", msg);
            return "viewpage";
        } else {
            String msg = "Sorry " + n + ". You entered an incorrect password";
            m.addAttribute("message", msg);
            return "errorpage";
        }
    }

    @RequestMapping("/home")
    public String homePage() {
        return "home";
    }
    
    @RequestMapping("/login")
    public String loginPage() {
        return "login";
    }

//    @RequestMapping("/hello")  
//    public String display(HttpServletRequest req, Model m)  
//    {  
//        //read the provided form data  
//        String name=req.getParameter("name");  
//        String pass=req.getParameter("pass");  
//        if(pass.equals("admin"))  
//        {  
//            String msg="Hello "+ name;  
//            //add a message to the model  
//            m.addAttribute("message", msg);  
//            return "viewpage";  
//        }  
//        else  
//        {  
//            String msg="Sorry "+ name+". You entered an incorrect password";  
//            m.addAttribute("message", msg);  
//            return "errorpage";  
//        }     
//    }  
}
