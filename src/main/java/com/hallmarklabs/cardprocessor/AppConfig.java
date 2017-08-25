package com.hallmarklabs.cardprocessor;

import com.google.inject.Inject;

import java.util.Properties;

public class AppConfig implements Configurable {
    @Inject
    public AppConfig() {
        System.out.println("DOING REAL CONFIGURATION");
    }

    @Override
    public Properties getProperties() {
        System.out.println("I (A REAL METHOD) GOT CALLED");
        return null;
    }

}
