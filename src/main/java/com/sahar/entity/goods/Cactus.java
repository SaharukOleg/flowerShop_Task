package com.sahar.entity.goods;

import com.sahar.entity.Plant;
import com.sahar.entity.enums.CactusType;
import com.sahar.entity.enums.Color;

public class Cactus extends Plant {
    private CactusType cactusType;

    public CactusType getCactusType() {
        return cactusType;
    }

    public void setCactusType(CactusType cactusType) {
        this.cactusType = cactusType;
    }

    public Cactus(CactusType cactusType, String name, double price, Color color) {
        super(name, price, color);
        this.cactusType = cactusType;
    }

    @Override
    public String toString() {
        return "Cactus{" +
                "cactusType=" + cactusType +
                "} " + super.toString();
    }
}
