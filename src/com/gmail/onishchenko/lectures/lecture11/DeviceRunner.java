package com.gmail.onishchenko.lectures.lecture11;

import com.gmail.onishchenko.lectures.lecture11.subpackage.Device;

public class DeviceRunner {
    public static void main(String[] args) {
        Device device = new Device();
        device.serialNumber = "111-1111";
        device.year = 2025;
        describe(device);

        Device anotherDevice = new Device();
        anotherDevice.serialNumber = "pretty";
        anotherDevice.year = 2026;
        describe(anotherDevice);
        anotherDevice.year--;
        describe(anotherDevice);
    }

    public static void describe(Device device) {
        System.out.println("I'm device with serialNumber == " + device.serialNumber);
        System.out.println("Production year == " + device.year);
        System.out.println();
    }
}
