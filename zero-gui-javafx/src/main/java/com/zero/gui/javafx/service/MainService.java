package com.zero.gui.javafx.service;

import org.springframework.stereotype.Service;

@Service
public class MainService {
    public String getWelcomeMessage() {
        return "欢迎使用 JavaFX 和 Spring Boot 开发的桌面应用！";
    }
}

