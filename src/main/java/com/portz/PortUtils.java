package com.portz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class PortUtils {
    private static final Logger logger = LoggerFactory.getLogger(PortUtils.class);

    public static boolean isValidPort(int port) {
        if (port > 65535 || port < 0){
            logger.error("You have entered an invalid port.");
            return false;
        }

        return true;
    }
}
