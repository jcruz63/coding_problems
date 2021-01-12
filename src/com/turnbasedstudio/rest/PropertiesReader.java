package com.turnbasedstudio.rest;

import java.io.IOException;
import java.net.URL;
import java.util.Properties;

public final class PropertiesReader {


    private static final Properties PROPERTIES;
    private static final String PROP_FILE = "apikey.properties";

    static {
        PROPERTIES = new Properties();
        final URL props = ClassLoader.getSystemResource(PROP_FILE);
        try {
            PROPERTIES.load(props.openStream());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private PropertiesReader() {
    }

    public static String getProperty(final String name) {

        return PROPERTIES.getProperty(name);
    }
}
