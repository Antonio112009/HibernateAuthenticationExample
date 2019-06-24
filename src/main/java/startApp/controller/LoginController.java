/*
 * Developed by Antonio112009 on 16/06/19 18:16
 * Last Modified 15/06/19 18:13
 * Copyright (c) 2019. All rights reserved
 *
 */

package startApp.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/login")
public class LoginController {

    @GetMapping
    public ModelAndView login(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");

        /*  Это мини-проверка того, что пользователь в системе. Это код получения сессии.

        try {
            Authentication auth = SecurityContextHolder.getContext().getAuthentication();
            if(!auth.getName().equals("anonymousUser")) {
                //System.out.println(auth.toString());
                return new ModelAndView("redirect:/");
            }
        } catch (Exception ignored) {}
        */

        return modelAndView;
    }
}