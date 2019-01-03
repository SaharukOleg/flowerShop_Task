package com.sahar.entity.enums;

import java.util.Arrays;
import java.util.List;

public enum Color {

    RED("red"),
    YELLOW("yellow"),
    GREEN("green"),
    PINK("pink"),
    WHITE("white"),
    VIOLET("violet"),
    BLUE("blue");


    private final String value;

    Color(final String valueNN) {
        this.value = valueNN;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static Color getEnum(String value) {
        List<Color> list = Arrays.asList(Color.values()); // бере весь список енамів  і фільтрує по мому значенню
        return list.stream().filter(valueNN -> valueNN.getValue().equals(value)).findAny().orElseThrow(IllegalArgumentException::new);


    }
}
