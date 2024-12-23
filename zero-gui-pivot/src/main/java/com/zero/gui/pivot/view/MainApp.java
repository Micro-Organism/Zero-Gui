package com.zero.gui.pivot.view;

import com.zero.gui.pivot.ZeroGuiPivotApplication;
import com.zero.gui.pivot.controller.MainController;
import org.apache.pivot.beans.BXMLSerializer;
import org.apache.pivot.collections.Map;
import org.apache.pivot.wtk.Application;
import org.apache.pivot.wtk.DesktopApplicationContext;
import org.apache.pivot.wtk.Display;
import org.apache.pivot.wtk.Window;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

public class MainApp implements Application {

    private ConfigurableApplicationContext springContext;

    @Override
    public void startup(Display display, Map<String, String> properties) throws Exception {
        springContext = new SpringApplicationBuilder(ZeroGuiPivotApplication.class).run();

        // 加载 BXML 文件
        BXMLSerializer bxmlSerializer = new BXMLSerializer();
        Window mainWindow = (Window) bxmlSerializer.readObject(getClass().getResource("/templates/main.bxml"));

        // 注入 Spring Bean 到控制器
        MainController controller = springContext.getBean(MainController.class);
        bxmlSerializer.bind(controller);

        mainWindow.open(display);
    }

    @Override
    public boolean shutdown(boolean optional) {
        springContext.close();
        return optional;
    }

    @Override
    public void suspend() throws Exception {
        // TODO: 暂停应用程序
    }

    @Override
    public void resume() throws Exception {
        // TODO: 恢复应用程序
    }

    public static void main(String[] args) {
        DesktopApplicationContext.main(MainApp.class, args);
    }
}

