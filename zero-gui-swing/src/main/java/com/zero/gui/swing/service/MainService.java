package com.zero.gui.swing.service;

import org.springframework.stereotype.Service;

@Service
public class MainService {
    public String getWelcomeMessage() {
        return "欢迎使用 Spring Boot 和 Swing 开发的桌面应用！";
    }
}

