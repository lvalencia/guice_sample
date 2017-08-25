package com.hallmarklabs.cardprocessor;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class App {
    public static void main( String[] args ) throws Exception
    {
        Injector injector = Guice.createInjector(new ConfigModule());

        CardProcessor cp = injector.getInstance(CardProcessor.class);
        cp.showProps();
    }
}
