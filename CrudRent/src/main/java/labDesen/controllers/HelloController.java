package labDesen.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {

    @GetMapping("/helloservlet")

    public String hello(HttpServletRequest request){
        request.setAttribute("name","nico");
        return "hello";
    }

    @GetMapping("/hello")

    public String hello(Model modelo){
        modelo.addAttribute("name","zézinho");
        return "hello";
    }

    @GetMapping("/model")

    public ModelAndView model(){ //nome do arquivo a ser renderizado
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("name","nico");
        return mv;
    }
}
