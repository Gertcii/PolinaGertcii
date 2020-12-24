package com.epam.training.center.hw3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigProperties {

    final static Properties PROPERTIES = new Properties();

    static {
        try (FileInputStream fis =
                     new FileInputStream(
                             "src/test/java/com/epam/training/center/hw3/resources/config.properties")) {
            PROPERTIES.load(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        return PROPERTIES.getProperty(key);
    }

}
