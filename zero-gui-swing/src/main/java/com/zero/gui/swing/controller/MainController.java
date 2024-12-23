package com.zero.gui.swing.controller;

import com.zero.gui.swing.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.swing.*;

@Controller
public class MainController {

    @Autowired
    private MainService mainService;

    public void handleButtonClick() {
        String message = mainService.getWelcomeMessage();
        JOptionPane.showMessageDialog(null, message, "信息", JOptionPane.INFORMATION_MESSAGE);
    }
}

