package com.atmarkplant.bestpractice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by dj110 on 12/10/16.
 */
@Controller
public class ApplicationUIController {

    @RequestMapping("/")
    public ModelAndView ui() {
        ModelAndView view = new ModelAndView();
        view.setViewName("index.html");
        return view;
    }
}
