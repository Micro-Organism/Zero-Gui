package com.zero.gui.pivot;

import org.apache.pivot.wtk.Theme;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ZeroGuiPivotApplication {

    public static void main(String[] args) {
        Theme theme = Theme.getTheme();
        SpringApplication.run(ZeroGuiPivotApplication.class, args);
    }

}
