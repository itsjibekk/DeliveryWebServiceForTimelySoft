package com.example.demo.controllers;

import com.example.demo.models.Parcel;
import com.example.demo.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MyController {


    private final OrderService orderService;

    @Autowired
    public MyController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/list")
    public Object listAllSenders(Model model){
        model.addAttribute("list",orderService.getAll());
        return "orders";
    }

    @GetMapping("/newParcelForm")
    public String showNewParcelForm(Model model){
        Parcel parcel = new Parcel();
        model.addAttribute("parcel",parcel);
        return "new";


    }
    @PostMapping("/saveParcel")
    public String saveParcel(@ModelAttribute("parcel") Parcel parcel){
        orderService.saveParcel(parcel);

        return "redirect:/list";

    }
}
