package com.hallmarklabs.cardprocessor;

import java.util.Properties;

public interface Configurable {
    Properties getProperties();
    String getProperty(String key);
}
