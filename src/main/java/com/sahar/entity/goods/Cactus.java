package com.sahar.entity.goods;

import com.sahar.entity.Plant;
import com.sahar.entity.enums.CactusType;
import com.sahar.entity.enums.Color;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "cactus")
@PrimaryKeyJoinColumn(name = "cactus_id")
public class Cactus extends Plant implements Serializable {

    @Column(name = "cactusType")
    private CactusType cactusType;


    public Cactus(CactusType cactusType, String name, double price, Color color) {
        super(name, price, color);
        this.cactusType = cactusType;
    }

    public CactusType getCactusType() {
        return cactusType;
    }

    public void setCactusType(CactusType cactusType) {
        this.cactusType = cactusType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cactus)) return false;
        if (!super.equals(o)) return false;

        Cactus cactus = (Cactus) o;

        return getCactusType() == cactus.getCactusType();
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getCactusType() != null ? getCactusType().hashCode() : 0);
        return result;
    }


    @Override
    public String toString() {
        return "Cactus{" +
                "cactusType=" + cactusType +
                "} " + super.toString();
    }
}
