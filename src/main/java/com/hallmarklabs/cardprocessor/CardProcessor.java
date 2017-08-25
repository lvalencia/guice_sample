package com.hallmarklabs.cardprocessor;

import com.google.inject.Inject;
import java.util.Properties;

public class CardProcessor {
    @Inject
    private Configurable config;

    @Inject
    public CardProcessor(Configurable config, Licensable license) throws Exception {
        license.loadLicenseFile();
        this.config = config;
    }

    public void showProps(){
        System.out.println(config);
    }
}
