package org.andrea;

/**
 * Naive Singleton implementation
 * This implementation is not thread-safe and can lead to race conditions
 * when multiple threads try to access the getInstance() method simultaneously.
 */
public final class Singleton {
    private static Singleton instance;
    public String value;

    private Singleton(String value) {
        // The following code emulates slow initialization
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
}
