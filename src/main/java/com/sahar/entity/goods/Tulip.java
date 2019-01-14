package com.sahar.entity.goods;

import com.sahar.entity.Plant;
import com.sahar.entity.enums.Color;
import com.sahar.entity.enums.TulipType;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tulip")
//@PrimaryKeyJoinColumn(name = "tulip_id")
@PrimaryKeyJoinColumn(name = "tulip_id")
@SequenceGenerator(
        name = "orminhSeq", //required logical name
        sequenceName = "ORMINH_SEQ" //name in database
)
public class Tulip extends Plant implements Serializable {

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

    public TulipType getTulipType() {
        return tulipType;
    }

    public void setTulipType(TulipType tulipType) {
        this.tulipType = tulipType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tulip)) return false;
        if (!super.equals(o)) return false;

        Tulip tulip = (Tulip) o;

        return getTulipType() == tulip.getTulipType();
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getTulipType() != null ? getTulipType().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Tulip{" +
                "tulipType=" + tulipType +
                "} " + super.toString();
    }
}
