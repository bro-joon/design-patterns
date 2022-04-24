package com.boksil2.singleton;

import java.io.FileNotFoundException;
import java.io.Serializable;

public class Settings implements Serializable {

    private Settings() {}

    private static class SettingsHolder {
        private static final Settings INSTANCE = new Settings();
    }

    public static Settings getInstance() {
        return SettingsHolder.INSTANCE;
    }
}
