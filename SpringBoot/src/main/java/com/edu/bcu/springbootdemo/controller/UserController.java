package com.edu.bcu.springbootdemo.controller;

import com.edu.bcu.springbootdemo.domain.TUser;
import com.edu.bcu.springbootdemo.service.UserService;
import com.sun.deploy.util.SessionState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import javax.servlet.http.HttpSession;

@Controller
@SessionAttributes(names = {"USER_NAME_SESSION"},types = {String.class})
public class UserController {
    @Autowired
    private final UserService userService;
    public UserController(UserService userService){
        this.userService=userService;
    }

    @GetMapping(value = "/register")
    public String showRegisterView(Model model){
        return "register";
    }

    @PostMapping(value = "/register")
    public String processRegister(TUser tUser, Model model){
        tUser.setRole("customer");
        boolean result = this.userService.register(tUser);
        if (result){
            model.addAttribute("tUser",tUser);
        }else{
            model.addAttribute("message","注册失败");
        }
        return "registerresult";
    }

    @GetMapping(value = "/login")
    public String showLoginView(Model model){
        return "login";
    }

    @PostMapping(value = "/processlogin")
    public String processlogin(String user_name,String password,Model model){
        boolean result=this.userService.login(user_name,password);
        if (result){
            model.addAttribute("message","true");
            model.addAttribute("USER_NAME_SESSION",user_name);
        }else{
            model.addAttribute("message","error");
        }
        return "loginresult";
    }

    @GetMapping(value = "/loginout")
    public String loginout(HttpSession httpSession, SessionStatus sessionStatus, Model model){
        httpSession.removeAttribute("USER_NAME_SESSION");
        httpSession.invalidate();
        sessionStatus.setComplete();
        return "login";
    }

}
