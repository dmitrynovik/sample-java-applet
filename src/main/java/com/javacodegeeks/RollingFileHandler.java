package com.javacodegeeks;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.LogRecord;

public class RollingFileHandler extends FileHandler {
    private int limit;

    public RollingFileHandler(String pattern, int limit) throws SecurityException, IOException {
        super(pattern);
        this.limit = limit;
    }
}