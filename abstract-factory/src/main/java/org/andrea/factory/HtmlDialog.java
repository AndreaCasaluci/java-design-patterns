package org.andrea.factory;

import org.andrea.buttons.Button;
import org.andrea.buttons.HtmlButton;

/**
 * HTML Dialog will produce HTML Buttons.
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() { return new HtmlButton(); }
}
