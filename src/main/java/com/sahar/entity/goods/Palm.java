package com.sahar.entity.goods;

import com.sahar.entity.Plant;
import com.sahar.entity.enums.Color;
import com.sahar.entity.enums.PalmType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "palm")
public class Palm extends Plant {

    @Column(name = "palmType")
    private PalmType palmType;

    public Palm(PalmType palmType, String name, double price, Color color) {
        super(name, price, color);
        this.palmType = palmType;
    }

    @Override
    public String toString() {
        return "Palm{" +
                "palmType=" + palmType +
                "} " + super.toString();
    }
}
