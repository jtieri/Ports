package com.portz;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Scan {
    private final int TIMEOUT = 200; // the timeout value to be used in milliseconds.

    private final ScanSettings scanSettings;

    private Scan(ScanSettings scanSettings) {
        this.scanSettings = scanSettings;
    }

    public static Scan create(ScanSettings scanSettings) {
        return new Scan(scanSettings);
    }

    public void scanPorts() {
        for(int i = scanSettings.getStartPort(); i <= scanSettings.getEndPort(); i++) {
            try {
                Socket sock = new Socket();
                sock.connect(new InetSocketAddress(scanSettings.getHost(), i), TIMEOUT);
                sock.close();

                System.out.println("Port: " + i + " is open.");
            } catch(IOException e) {
                System.out.println("Port: " + i + " is closed.");
            }
        }
    }
}
