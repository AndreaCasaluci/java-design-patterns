package org.andrea.checkboxes;

import lombok.extern.slf4j.Slf4j;

/**
 * All products families have the same varieties (MacOS/Windows).
 *
 * This is a variant of a checkbox.
 */
@Slf4j
public class MacOSCheckbox implements Checkbox {

    @Override
    public void paint() {
        log.info("You have created MacOS Checkbox.");
    }

}
