package com.example.test.model.enums;

public enum LaptopSize {

    THIRTEEN(0), FOURTEEN(1), FIFTEEN(2), SEVENTEEN(3);
    private final int value;


    LaptopSize(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
