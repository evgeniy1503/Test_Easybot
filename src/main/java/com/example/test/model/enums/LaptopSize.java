package com.example.test.model.enums;

public enum LaptopSize {

    THIRTEEN(13), FOURTEEN(14), FIFTEEN(15), SEVENTEEN(17);
    private final int value;


    LaptopSize(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
