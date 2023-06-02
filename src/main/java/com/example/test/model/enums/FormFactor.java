package com.example.test.model.enums;

public enum FormFactor {

    DESKTOP("Desktop"), NETTOP("Nottop"), MONOBLOCK("Monoblock");

    private final String value;


    FormFactor(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
