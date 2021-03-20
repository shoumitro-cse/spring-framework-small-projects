package com.controller;

import com.model.EmployeeBean;
import com.model.MainModel;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//mysql-connector-java-5.1.23-bin.jar => from local computer
//spring4 & spring4 mvc & JSTL1.2.1 => jar file from netbeen libray

@Controller
public class HelloController {

    @Autowired
    MainModel dao;//will inject dao from XML file    

    @RequestMapping("/hello")
    public String display(@RequestParam("name") String n, @RequestParam("pass") String p, Model m) {

        if (p.equals("admin")) {
            String msg = "Hello " + n;
            //add a message to the model  
            m.addAttribute("message", msg);
            return "public/viewpage";
        } else {
            String msg = "Sorry " + n + ". You entered an incorrect password";
            m.addAttribute("message", msg);
            return "public/errorpage";
        }
    }

    @RequestMapping("/home")
    public String homePage() {

//        dao = new MainModel();

//        EmployeeBean emp1 = new EmployeeBean(101, "Samir Pal", 2000f);
//        dao.saveEmployee(emp1);

//        List<Employee> list = dao.getAllEmployees();
//        for (EmployeeBean e : list) {
//            System.out.println("Name : " + e.getName());
//        }

        return "public/home";
    }

    @RequestMapping("/login")
    public String loginPage() {
        return "user_login/login";
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
