package org.andrea.factory;

import org.andrea.buttons.Button;

/**
 * Base Factory Class. Note that "Factory" is merely a role for the class.
 * It should have some core business logic which needs different products
 * to be created.
 */
public abstract class Dialog {

    public void rendererWindow() {
        Button okButton = createButton();
        okButton.renderer();
    }

    /**
     * Subclasses will override this method in order to create specific button objects.
     */
    public abstract Button createButton();
}
