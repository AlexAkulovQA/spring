package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TaskController {
    //localhost:8080/s?k=table
    @RequestMapping("/s")
    public String getProductList(@RequestParam(value = "k") String productName, Model model){
        model.addAttribute("product",productName);
        return "product/product-info";
    }

}
