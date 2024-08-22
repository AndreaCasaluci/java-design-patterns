package org.andrea;

import org.andrea.factory.Dialog;
import org.andrea.factory.HtmlDialog;
import org.andrea.factory.WindowsDialog;

public class FactoryMethodDemo {

    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    /**
     * The concrete factory is usually chosen depending on configuration
     * or environment options.
     */
    static void configure() {
        if (System.getProperty("os.name").toLowerCase().contains("windows")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    /**
     * All of the client code should work with factories and products through
     * abstract interfaces. This way it does not care which factory it works
     * with and what kind of product it returns.
     */
    static void runBusinessLogic() {
        dialog.rendererWindow();
    }
}