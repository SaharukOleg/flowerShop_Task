package com.sahar.entity;

import com.sahar.entity.enums.Color;

import javax.persistence.*;

//@Entity
//@Table(name = "plant")
@MappedSuperclass
public class Plant { //батьківський клас рослина !
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private double price;
    @Enumerated(EnumType.STRING)
    @Column(length = 10)
    private Color color;


    public Plant() {
    }

    public Plant(String name, double price, Color color) {
        this.name = name;
        this.price = price;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Plant)) return false;

        Plant that = (Plant) o;

        if (Double.compare(that.getPrice(), getPrice()) != 0) return false;
        if (getName() != null ? !getName().equals(that.getName()) : that.getName() != null) return false;
        return getColor() == that.getColor();
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getName() != null ? getName().hashCode() : 0;
        temp = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (getColor() != null ? getColor().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "com.sahar.entity.Plant{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", color=" + color +
                '}';
    }
}
