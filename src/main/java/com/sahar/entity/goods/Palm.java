package com.sahar.entity.goods;

import com.sahar.entity.Plant;
import com.sahar.entity.enums.Color;
import com.sahar.entity.enums.PalmType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "palm")
@PrimaryKeyJoinColumn(name = "palm_id")
public class Palm extends Plant implements Serializable {

    @Column(name = "palmType")
    private PalmType palmType;

    public Palm(PalmType palmType, String name, double price, Color color) {
        super(name, price, color);
        this.palmType = palmType;
    }

    public PalmType getPalmType() {
        return palmType;
    }

    public void setPalmType(PalmType palmType) {
        this.palmType = palmType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Palm)) return false;
        if (!super.equals(o)) return false;

        Palm palm = (Palm) o;

        return getPalmType() == palm.getPalmType();
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getPalmType() != null ? getPalmType().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Palm{" +
                "palmType=" + palmType +
                "} " + super.toString();
    }
}
