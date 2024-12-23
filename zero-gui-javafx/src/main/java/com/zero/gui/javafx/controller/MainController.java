package com.zero.gui.javafx.controller;

import javafx.fxml.FXML;
import org.springframework.stereotype.Controller;

@Controller
public class MainController {

    @FXML
    private void onButtonClick() {
        System.out.println("按钮被点击！");
    }
}

