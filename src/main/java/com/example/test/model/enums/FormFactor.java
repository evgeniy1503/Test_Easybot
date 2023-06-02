package com.example.test.model.enums;

public enum FormFactor {

    DESKTOP(0), NETTOP(1), MONOBLOCK(2);

    private final int value;


    FormFactor(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
