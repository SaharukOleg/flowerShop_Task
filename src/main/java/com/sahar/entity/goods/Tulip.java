package com.sahar.entity.goods;

import com.sahar.entity.Plant;
import com.sahar.entity.enums.Color;
import com.sahar.entity.enums.TulipType;

import javax.persistence.*;

@Entity
@Table(name = "tulip")
public class Tulip extends Plant {

  //  @Enumerated()

    @Enumerated(EnumType.STRING)
    @Column(length = 10)
    private TulipType tulipType;

    public Tulip(TulipType tulipType, String name, double price, Color color) {
        super(name, price, color);
        this.tulipType = tulipType;
    }

    public Tulip() {
    }

    @Override
    public String toString() {
        return "Tulip{" +
                "tulipType=" + tulipType +
                "} " + super.toString();
    }
}
