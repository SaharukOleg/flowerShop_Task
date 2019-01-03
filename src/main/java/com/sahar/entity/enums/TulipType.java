package com.sahar.entity.enums;


import java.util.Arrays;
import java.util.List;

public enum TulipType {
    TERRY("terry"), // махровий
    LILIUM("lilium"), // лілійний
    PIONEER("pioneer"); // піоновидний

    private final String value;

    TulipType(final String valueNNN) {
        this.value = valueNNN;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static TulipType getEnum(String value) {
        List<TulipType> list = Arrays.asList(TulipType.values()); // бере весь список енамів  і фільтрує по мому значенню
        return list.stream().filter(valueNNN -> valueNNN.getValue().equals(value)).findAny().orElseThrow(IllegalArgumentException::new);
    }
}
