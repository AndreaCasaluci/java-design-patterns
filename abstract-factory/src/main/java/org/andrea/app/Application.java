package org.andrea.app;

import org.andrea.buttons.Button;
import org.andrea.checkboxes.Checkbox;
import org.andrea.factories.GUIFactory;

/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */
public class Application {

    private final Button button;
    private final Checkbox checkbox;

    public Application(GUIFactory factory) {

        button = factory.createButton();
        checkbox = factory.createCheckbox();

    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }

}
