package com.hallmarklabs.cardprocessor;

import com.google.inject.Inject;
import java.util.Properties;

public class CardProcessor {
    private Properties props;

    @Inject
    public CardProcessor(Configurable config) {
        this.props = config.getProperties();
    }

    public void showProps(){
        System.out.println(props);
    }
}
