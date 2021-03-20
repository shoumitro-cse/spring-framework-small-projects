/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.model.EmployeeBean;
import com.model.MainModel;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author shoumitro
 */
@Controller
public class MainController {

    @Autowired
    MainModel dao;//will inject dao from XML file    

    @RequestMapping("/index")
    public String indexPage(Model m) {
        return "curd/index";
    }

    /*It displays a form to input data, here "command" is a reserved request attribute  
     *which is used to display object data into form  
     */
    @RequestMapping("/empform")
    public String showform(Model m) {
        m.addAttribute("command", new EmployeeBean());
        return "curd/empform";
    }

    /*It saves object into database. The @ModelAttribute puts request data  
     *  into model object. You need to mention RequestMethod.POST method   
     *  because default request is GET*/
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@ModelAttribute("emp") EmployeeBean emp) {
        dao.saveEmployee(emp);
        return "redirect:/viewemp";//will redirect to viewemp request mapping    
    }

    /* It provides list of employees in model object */
    @RequestMapping("/viewemp")
    public String viewemp(Model m) {
        List<EmployeeBean> list = dao.getAllEmployees();
        m.addAttribute("list", list);
        return "curd/viewemp";
    }

    @RequestMapping(value = "/viewemp/{pageid}")
    public String pageView(@PathVariable int pageid, Model m) {
        int total = 2;
        if (pageid == 1) {
        } else {
            pageid = (pageid - 1) * total + 1;
        }
        System.out.println(pageid);
        List<EmployeeBean> list = dao.getEmployeesByPage(pageid, total);
        m.addAttribute("list", list);
        return "curd/viewemp";
    }


    /* It displays object data into form for the given id.   
     * The @PathVariable puts URL data into variable.*/
    @RequestMapping(value = "/editemp/{id}")
    public String edit(@PathVariable int id, Model m) {
        EmployeeBean emp = dao.getEmpById(id);
        m.addAttribute("command", emp);  // this variable internally use for edit form
        return "curd/empeditform";
    }

    /* It updates model object. */
    @RequestMapping(value = "/editsave", method = RequestMethod.POST)
    public String editsave(@ModelAttribute("emp") EmployeeBean emp) {
        dao.update(emp);
        return "redirect:/viewemp";
    }

    /* It deletes record for the given id in URL and redirects to /viewemp */
    @RequestMapping(value = "/deleteemp/{id}", method = RequestMethod.GET)
    public String delete(@PathVariable int id) {
        dao.delete(id);
        return "redirect:/viewemp";
    }

    
    
    
    
    
//    @RequestMapping("/file")
//    public String fileUpload(Model m) {
//        return "curd/file";
//    }
    
    @RequestMapping("file")  
    public ModelAndView uploadForm(){  
        return new ModelAndView("curd/file");    
    }
    
    @RequestMapping(value = "/savefile", method = RequestMethod.POST)
    public ModelAndView upload(@RequestParam CommonsMultipartFile file, HttpSession session) {
        String path = session.getServletContext().getRealPath("/");
        String filename = file.getOriginalFilename();

        System.out.println(path + " " + filename);
        try {
            byte barr[] = file.getBytes();

            BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream(path + "/" + filename));
            bout.write(barr);
            bout.flush();
            bout.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return new ModelAndView("curd/file", "filename", path + "/" + filename);
    }

    
//    //   private static final String UPLOAD_DIRECTORY = "/images";
//    private static final String UPLOAD_DIRECTORY = "/";
//
//    @RequestMapping(value = "savefile", method = RequestMethod.POST)
//    public ModelAndView saveimage(@RequestParam CommonsMultipartFile file,
//            HttpSession session) throws Exception {
//
//        ServletContext context = session.getServletContext();
//        String path = context.getRealPath(UPLOAD_DIRECTORY);
//        String filename = file.getOriginalFilename();
//
//        System.out.println(path + " " + filename);
//
//        byte[] bytes = file.getBytes();
//        BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(
//                new File(path + File.separator + filename)));
//        stream.write(bytes);
//        stream.flush();
//        stream.close();
//
//        return new ModelAndView("uploadform", "filesuccess", "File successfully saved!");
//    }
}

