package com.hallmarklabs.cardprocessor;

import com.google.inject.AbstractModule;

public class ConfigModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Configurable.class).to(AppConfig.class);
    }
}
