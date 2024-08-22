package org.andrea;

import org.andrea.app.Application;
import org.andrea.factories.GUIFactory;
import org.andrea.factories.MacOSFactory;
import org.andrea.factories.WindowsFactory;

public class AbstractFactoryMethodDemo {

    private static Application configureApplication() {

        Application app;
        GUIFactory factory;

        String osName = System.getProperty("os.name").toLowerCase();
        if(osName.contains("windows")) {
            factory = new WindowsFactory();
        } else {
            factory = new MacOSFactory();
        }

        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}