package com.sahar.entity.goods;

import com.sahar.entity.Plant;
import com.sahar.entity.enums.CactusType;
import com.sahar.entity.enums.Color;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cactus")
public class Cactus extends Plant {

    @Column(name = "cactusType")
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
