package com.chen.controller;

import com.chen.pojo.User;
import com.chen.service.UserService;
import com.chen.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    @Qualifier("UserServiceImpl")
    private UserService userService;
    @RequestMapping("/toLogin")
    public String toLoginPaper(){
        return "login";
    }
    @RequestMapping("/ajax1")
    @ResponseBody
    public String idTest(String id){
        int id1 =Integer.parseInt(id);
        System.out.println(id1);
        User user = userService.idTest(id1);
        String msg="";
        if (user!=null){
            msg="true";
        }else {
            msg="false";
        }
        return msg;
    }
    @RequestMapping("/login")
    public String login(int id, String password , Model model, HttpSession session){
        User user = userService.login(id, password);
        if (user!=null){
            session.setAttribute("userLoginInfo",id);
            return "homePage";
        }else {
            model.addAttribute("msg","账号或者密码错误");
            return "login";
        }
    }
    @RequestMapping("/toAddUser")
    public String toAddUser(User user){

        return "addUser";
    }
    @RequestMapping("/addUser")
    public String addUser(User user){
        userService.addUser(user);
        return "addUser";
    }
    @RequestMapping("/deleteUser")
    public String deleteUser(HttpSession session){
        Object id = session.getAttribute("userLoginInfo");
        int id1=Integer.parseInt(String.valueOf(id));
        userService.deleteUser(id1);
        System.out.println("删除id为"+id1+"的账号");
        return "login";
    }
    @RequestMapping("/exit")
    public String exit(HttpSession session){
        session.setAttribute("userLoginInfo",null);
        return "login";
    }

}
