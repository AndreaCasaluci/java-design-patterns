package org.andrea;

public final class Singleton {
    //The field must be declared volatile so that double check lock would work
    //correctly in a multithreaded environment.
    private static volatile Singleton instance;

    public String value;

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        //The approach taken here is called double-checked locking (DCL).
        //It exists to prevent race condition between multiple threads that may
        //attempt to get singleton instance at the same time, creating separate
        //instances as a result.
        //
        //It is not guaranteed that singleton instance will be created if the
        //instance already exists, but it is guaranteed that it will be created
        //only once, and it will be created only when needed.
        Singleton result = instance;
        if (result != null) {
            return result;
        }
        synchronized (Singleton.class) {
            if (instance == null) {
                instance = new Singleton(value);
            }
            return instance;
        }
    }
}
