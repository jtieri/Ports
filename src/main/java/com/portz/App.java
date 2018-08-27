package com.portz;

/**
 * Entry point into the application. Includes the main method which bootstraps/runs the application.
 */
public class App {
    public static void main( String[] args ) {
        ScanSettings scanSettings = ScanSettings.create();
        Scan scan = Scan.create(scanSettings);

        scan.scanPorts();
    }
}
