package com.not404.panel.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogBase {

    public static Logger getLogger(Class o){
        return LoggerFactory.getLogger(o);
    }

}
