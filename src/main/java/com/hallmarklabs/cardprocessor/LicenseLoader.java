package com.hallmarklabs.cardprocessor;

import com.google.inject.Inject;
import com.itextpdf.licensekey.LicenseKey;

public class LicenseLoader implements Licensable {
    private static final String keyPath = "iTextKeyPath";

    @Inject
    private Configurable config;

    @Inject
    public LicenseLoader(Configurable config) {
        this.config = config;
    }

    @Override
    public void loadLicenseFile() throws Exception {
        LicenseKey.loadLicenseFile(config.getProperty(this.keyPath));
        System.out.println("LOADED THE LICENSE");
    }
}
