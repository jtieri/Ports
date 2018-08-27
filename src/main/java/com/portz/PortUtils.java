package com.portz;

public class PortUtils {

    public static boolean isValidPort(int port) {
        if (port > 65535 || port < 0){
            System.out.println("You have entered an invalid port.");
            return false;
        }

        return true;
    }
}
