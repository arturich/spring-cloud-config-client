package com.cloud.configclient.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/client")
public class RateController {

    @Value("${rate}")
    String rate;
    
    @Value("${lanecount}")
    String lanecount;

    @Value("${tollstart}")
    String tollstart;

    @GetMapping("/rate")
    public String getRate(Model theModel)
    {
        theModel.addAttribute("rateamount",rate);
        theModel.addAttribute("lanes",lanecount);
        theModel.addAttribute("tollstart",tollstart);

        return "rateview";
    }

    


}
