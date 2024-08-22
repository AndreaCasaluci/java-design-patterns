package org.andrea.factories;

import org.andrea.buttons.Button;
import org.andrea.buttons.MacOSButton;
import org.andrea.checkboxes.Checkbox;
import org.andrea.checkboxes.MacOSCheckbox;


/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
