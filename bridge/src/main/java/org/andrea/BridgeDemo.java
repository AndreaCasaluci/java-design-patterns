package org.andrea;

import org.andrea.devices.Device;
import org.andrea.devices.Radio;
import org.andrea.devices.Tv;
import org.andrea.remotes.AdvancedRemote;
import org.andrea.remotes.BasicRemote;

public class BridgeDemo {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.mute();
        device.printStatus();
    }
}