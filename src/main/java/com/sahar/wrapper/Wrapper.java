package com.sahar.wrapper;

import com.sahar.entity.enums.Color;

import javax.persistence.*;

@Entity
@Table(name = "wrapper")
public class Wrapper {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Enumerated(EnumType.STRING)
    @Column(length = 15)
    private WrapperType wrapperType;

    @Enumerated(EnumType.STRING)
    @Column(length = 15)
    private Color color;

    @Column(name = "price")
    private int price;

    public Wrapper(WrapperType wrapperType, Color color, int price) {
        this.wrapperType = wrapperType;
        this.color = color;
        this.price = price;
    }

    public Wrapper() {
    }

    public WrapperType getWrapperType() {
        return wrapperType;
    }

    public Color getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Wrapper{" +
                "wrapperType=" + wrapperType +
                ", color=" + color +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Wrapper)) return false;

        Wrapper wrapper = (Wrapper) o;

        if (id != wrapper.id) return false;
        if (getPrice() != wrapper.getPrice()) return false;
        if (getWrapperType() != wrapper.getWrapperType()) return false;
        return getColor() == wrapper.getColor();
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (getWrapperType() != null ? getWrapperType().hashCode() : 0);
        result = 31 * result + (getColor() != null ? getColor().hashCode() : 0);
        result = 31 * result + getPrice();
        return result;
    }
}
