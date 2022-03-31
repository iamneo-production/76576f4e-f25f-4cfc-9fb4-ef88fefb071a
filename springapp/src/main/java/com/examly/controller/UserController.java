package com.examly.controller;

import com.examly.model.User;
import com.examly.dao.UserDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @Autowired
    private static UserDao userDao;

    @GetMapping("/")
    public ModelAndView login() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("welcome");
        return mv;
    }

    @PostMapping(value = "/signup")
    public ModelAndView signup(@RequestParam("name") String name, @RequestParam("mail") String mail,
            @RequestParam("password") String password, @RequestParam("number") String number,
            @RequestParam("order") String order, @RequestParam("cart") String cart) {
        User user = new User();
        user.setMobNo(number);
        user.setUsername(name);
        user.setActive("1");
        user.setCart(cart);
        user.setRole("user");
        user.setOrderList(order);
        user.setPassword(password);
        user.setEmail(mail);
        userDao.save(user);
        System.out.println(user);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("login");
        return mv;
    }
}
