package com.zero.gui.pivot.service;

import org.springframework.stereotype.Service;

@Service
public class MainService {
    public String getWelcomeMessage() {
        return "欢迎使用 Apache Pivot 和 Spring Boot 开发的桌面应用！";
    }
}

