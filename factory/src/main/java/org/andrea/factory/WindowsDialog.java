package org.andrea.factory;

import org.andrea.buttons.Button;
import org.andrea.buttons.WindowsButton;

/**
 * Windows Dialog will produce Windows Buttons.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
