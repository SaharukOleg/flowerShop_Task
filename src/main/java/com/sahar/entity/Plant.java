package com.sahar.entity;

import com.sahar.bouquets.Bouquet;
import com.sahar.entity.enums.Color;

import javax.persistence.*;

@Entity(name = "plant")
//@Table(name = "plant")
//@MappedSuperclass
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) //  неможу до @MappedSuperclass робити відношення
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
    @ManyToOne(fetch = FetchType.EAGER)
    //@Column(name = "bouquet")
    private Bouquet bouquet;


    public Plant() {
    }

    public Plant(String name, double price, Color color) {
        this.name = name;
        this.price = price;
        this.color = color;
    }

    public Bouquet getBouquet() {
        return bouquet;
    }

    public void setBouquet(Bouquet bouquet) {
        this.bouquet = bouquet;
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
        return "Plant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", color=" + color +
                ", bouquet=" + bouquet +
                '}';
    }
}
