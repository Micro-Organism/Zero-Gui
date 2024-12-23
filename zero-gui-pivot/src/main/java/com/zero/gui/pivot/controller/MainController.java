package com.zero.gui.pivot.controller;

import com.zero.gui.pivot.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MainController {

    @Autowired
    private MainService mainService;

    public void onButtonClick() {
        System.out.println(mainService.getWelcomeMessage());
    }
}

