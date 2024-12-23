package com.zero.gui.swing.view;

import com.zero.gui.swing.controller.MainController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class MainFrame extends JFrame {

    @Autowired
    private MainController mainController;

    public MainFrame() {
        setTitle("Swing with Spring Boot");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        initUI();
    }

    private void initUI() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JLabel label = new JLabel("欢迎来到首页", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(label, BorderLayout.NORTH);

        JButton button = new JButton("点击我");
        button.addActionListener(e -> mainController.handleButtonClick());
        panel.add(button, BorderLayout.CENTER);

        add(panel);
    }
}

