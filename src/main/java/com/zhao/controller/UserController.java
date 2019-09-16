package com.zhao.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhao.model.User;
import com.zhao.service.UserService;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

	@Autowired
    private UserService userService;
	
     @RequestMapping("/index")
     public String index() {
         return "/index";
     }
     
     @RequestMapping("/findAll")
     public String findAll(HttpServletRequest request) {
    	 List<User> listTest = userService.findAll();
    	 request.setAttribute("listUser", listTest);
    	 return "/all";
     }

     @RequestMapping(value = "/register", method = RequestMethod.GET)
     public String register() {
         return "register";
     }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(HttpServletRequest request, String account, String password) {
        User user = userService.selectUserByAccount(account);
        if (user==null) {
            user = new User();
            user.setAccount(account);
            user.setPassword(password);
            userService.insertUser(user);
            request.setAttribute("user",user);
            return "registered";
        } else {
            request.setAttribute("error","用户名已经存在");
        }
        return "register";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
         return  "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(HttpServletRequest request, String account, String password) {
        User user = userService.login(account,password);
        if (user!=null) {
            request.setAttribute("user",user);
            return  "redirect:/index";
        } else {
            request.setAttribute("error","用户名或密码错误");
            return "login";
        }
    }

    @RequestMapping("/login_details")
    public String loginDetails() {
        return "registered";
    }
}
