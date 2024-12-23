package com.zero.gui.swing;

import com.zero.gui.swing.view.HomePageFrame;
import com.zero.gui.swing.view.MainFrame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.swing.*;

@SpringBootApplication
public class ZeroGuiSwingApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(ZeroGuiSwingApplication.class, args);
        SwingUtilities.invokeLater(() -> {
//            MainFrame mainFrame = context.getBean(MainFrame.class);
            context.getBean(HomePageFrame.class)

            mainFrame.setVisible(true);
        });
    }

}
