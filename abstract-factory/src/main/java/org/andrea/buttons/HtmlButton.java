package org.andrea.buttons;

/**
 * HTML Button implementation
 */
public class HtmlButton implements Button {

    @Override
    public void renderer() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}
