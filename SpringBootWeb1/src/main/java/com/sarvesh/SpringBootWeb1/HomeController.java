package com.sarvesh.SpringBootWeb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @ModelAttribute("course")
    public String courseName(){
        return "JAVA";
    }

    @RequestMapping("/")
    public String home(){
        System.out.println("Home method called");
        return "index";
    }

//    // ========== HttpServletRequest method ======================= //
//    @RequestMapping("add")
//    public String add(HttpServletRequest req, HttpSession session){
//        int num1 = Integer.parseInt(req.getParameter("num1"));
//        int num2 = Integer.parseInt(req.getParameter("num2"));
//        int result = num1 + num2;
//        session.setAttribute("result", result);
//        return "result.jsp";
//    }


    //    // ========== HttpSession method ======================= //
//    @RequestMapping("add")
//    public String add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, HttpSession session){
//        int result = num1 + num2;
//        session.setAttribute("result", result);
//        return "result.jsp";
//    }


    //    // ========== Model ======================= //
//    @RequestMapping("add")
//    public String add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model){
//        int result = num1 + num2;
//        model.addAttribute("result", result);
//        return "result";
//    }


    //    // =============== ModelAndView============== //
    @RequestMapping("add")
    public ModelAndView add(int num1, int num2, ModelAndView mv){
        int result = num1 + num2;
        mv.addObject("result", result);
        mv.setViewName("result");
        return mv;
    }

    // =============== ModelAndView for adding alien ============== //
//    @RequestMapping("addAlien")
//    public ModelAndView addAlien(int aId, String aName, ModelAndView mv){
//        Alien alien = new Alien();
//        alien.setaId(aId);
//        alien.setaName(aName);
//        mv.addObject("alien", alien);
//        mv.setViewName("result");
//        return mv;
//    }

    // =============== Making code simpler ============== //
    @RequestMapping("addAlien")
    public String addAlien(Alien alien, ModelAndView mv){
        return "result";
    }


}
