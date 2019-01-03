package com.sahar.entity.goods;

import com.sahar.entity.Plant;
import com.sahar.entity.enums.Color;
import com.sahar.entity.enums.TulipType;

public class Tulip extends Plant {
    private TulipType tulipType;

    public Tulip(TulipType tulipType, String name, double price, Color color) {
        super(name, price, color);
        this.tulipType = tulipType;
    }

    @Override
    public String toString() {
        return "Tulip{" +
                "tulipType=" + tulipType +
                "} " + super.toString();
    }
}
