package com.portz;

import java.io.IOException;
import java.net.Socket;

public class Scan {
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
                Socket sock = new Socket(scanSettings.getHost(), i);

                System.out.println("Port: " + i + " is open.");
                sock.close();
            } catch(IOException e) {
                System.out.println("Error due to: " + e.getCause());
            }
        }
    }

}
