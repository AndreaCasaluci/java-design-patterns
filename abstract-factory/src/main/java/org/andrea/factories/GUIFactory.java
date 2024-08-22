package org.andrea.factories;

import org.andrea.buttons.Button;
import org.andrea.checkboxes.Checkbox;

/**
 * Abstract factory knows about all (abstract) product types
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
