package com.portz;

import java.util.Scanner;

public class ScanSettings {
    private final int startPort;
    private final int endPort;
    private final String host;

    private ScanSettings() {
        this.startPort = setStartPort();
        this.endPort = setEndPort();
        this.host = setHost();
    }

    public static ScanSettings create() {
        return new ScanSettings();
    }

    // Mutator Methods

    private static int setStartPort() {
        Scanner keyboard = new Scanner(System.in);
        int tempPort ;

        do {
            System.out.println("Enter the starting port.");
            tempPort = Integer.parseInt(keyboard.nextLine());
        } while(! PortUtils.isValidPort(tempPort));

        keyboard.close();
        return tempPort;
    }

    private static int setEndPort() {
        Scanner keyboard = new Scanner(System.in);
        int tempPort;

        do {
            System.out.println("Enter the ending port.");
            tempPort = Integer.parseInt(keyboard.nextLine());
        } while(! PortUtils.isValidPort(tempPort));

        keyboard.close();
        return tempPort;
    }

    private static String setHost() {
        Scanner keyboard = new Scanner(System.in);
        String tempIP;

        do {
            System.out.println("Enter the IP or domain of the machine you want to scan.");
            tempIP = keyboard.nextLine().trim();
        } while (! tempIP.equals(" "));

        keyboard.close();
        return tempIP;
    }

    // Accessors

    public int getStartPort() {
        return this.startPort;
    }

    public int getEndPort() {
        return this.endPort;
    }

    public String getHost() {
        return this.host;
    }
}
