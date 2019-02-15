package com.javacodegeeks;

import org.apache.logging.log4j.Logger;

public class App extends javax.swing.JApplet
{
    private static final long serialVersionUID = 1L;
    private static final Logger logger = org.apache.logging.log4j.LogManager.getLogger(App.class);

    public void init() {
        logger.info("initialized");
    }

    public void start() {
        logger.info("started");
    }

    public void stop() {
        logger.info("stopped");
    }
    
    public void destroy() {
        logger.info("destroyed");
    }
}
