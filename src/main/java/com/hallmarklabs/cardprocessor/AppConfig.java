package com.hallmarklabs.cardprocessor;

import com.google.inject.Inject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class AppConfig implements Configurable {
    private static final String propertiesFileName = "cardProcessor.properties";
    private Properties properties;

    @Inject
    public AppConfig() throws IOException {
        this.properties = new Properties();
        this.properties.load(new FileInputStream(new File(propertiesFileName)));
    }

    @Override
    public Properties getProperties() {
        return this.properties;
    }

    @Override
    public String getProperty(String key) {
        return this.properties.getProperty(key);
    }
}
