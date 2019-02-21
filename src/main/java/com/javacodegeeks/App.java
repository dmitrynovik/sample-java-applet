package com.javacodegeeks;

import java.awt.Graphics;
import java.util.Locale;
import java.util.ResourceBundle;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.appender.ConsoleAppender;
import org.apache.logging.log4j.core.config.Configurator;
import org.apache.logging.log4j.core.config.builder.api.AppenderComponentBuilder;
import org.apache.logging.log4j.core.config.builder.api.ConfigurationBuilder;
import org.apache.logging.log4j.core.config.builder.api.ConfigurationBuilderFactory;
import org.apache.logging.log4j.core.config.builder.impl.BuiltConfiguration;

public class App extends javax.swing.JApplet
{
    private static final long serialVersionUID = 1L;
    private static Logger logger;
    //private LoggerContext ctx;

    public App() {
        // Locale locale = Locale.ROOT;
        // final String configResource = "log4j2.component";
        // ResourceBundle bundle = ResourceBundle.getBundle(configResource, locale);        

        //System.setProperty("log4j2.configurationFactory", CustomConfigurationFactory.class.getName());
        System.setProperty("log4j.configurationFile", "log4j2.component.properties");
        logger = LogManager.getLogger(App.class);
        //logger.info(String.format("loading settings from %s.properties, locale: %s", configResource, locale));
    }

    @Override
    public void init() {
        logger.info("initialized");
    }

    @Override
    public void start() {
        logger.info("started");
    }

    @Override
    public void stop() {
        logger.info("stopped");
    }
    
    @Override
    public void destroy() {
        logger.info("destroyed");
    }

    @Override
    public void paint(Graphics g){
        logger.info("painting");
        String text = "pwd: " + System.getProperty("user.dir");
        g.drawString(text, 1, 10);
        logger.info("painting done");
    }
}
