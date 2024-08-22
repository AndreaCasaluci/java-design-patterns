package org.andrea.buttons;

import lombok.extern.slf4j.Slf4j;


/**
 * All products families have the same varieties (MacOS/Windows).
 * <p>
 * This is a MacOS variant of a button.
 */
@Slf4j
public class MacOSButton implements Button {

    @Override
    public void paint() {
        log.info("You have created MacOS Button.");
    }

}
