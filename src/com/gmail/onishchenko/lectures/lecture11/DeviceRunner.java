package com.gmail.onishchenko.lectures.lecture11;

import com.gmail.onishchenko.lectures.lecture11.subpackage.Device;

public class DeviceRunner {
    public static void main(String[] args) {
        Device device = new Device("111-1111");
        device.describe();

        Device anotherDevice = new Device("pretty", 2026);
        anotherDevice.describe();
        anotherDevice.year--;
        anotherDevice.describe();

        Device defaultDevice = new Device();
        defaultDevice.describe();
    }


}
