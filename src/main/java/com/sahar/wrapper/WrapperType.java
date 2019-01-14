package com.sahar.wrapper;

import com.sahar.entity.enums.TulipType;

import java.util.Arrays;
import java.util.List;

public enum WrapperType {
    TAPE("tape"), // стрічка
    PAPER_COWER("paper_cower"), //
  //  FLIZELIN_COWER, // хз шо мали на увазі
    PLASTIC_POT("plastic_pot"); // пластиковий горщик
 //   CERAMIC_POT; // керамічний горщик ;


    private final String value;

    WrapperType(final String valueNNN) {
        this.value = valueNNN;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static WrapperType getEnum(String value) {
        List<WrapperType> list = Arrays.asList(WrapperType.values()); // бере весь список енамів  і фільтрує по мому значенню
        return list.stream().filter(valueNNN -> valueNNN.getValue().equals(value)).findAny().orElseThrow(IllegalArgumentException::new);
    }
}
