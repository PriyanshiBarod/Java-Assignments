package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController
{
   @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public ModelAndView getHello()
   {
       String str="Hello World from controller";
       return new ModelAndView("helloWorld","message",str);
   }
}