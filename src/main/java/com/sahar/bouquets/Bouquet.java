package com.sahar.bouquets;

import com.sahar.entity.Plant;

import com.sahar.wrapper.Wrapper;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Entity
@Table(name = "bouquet")
public class Bouquet {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;


    //   @Column(name = "wrapper")
    // private Wrapper wrapper;
    private int totalPrice;


    @OneToMany(cascade = CascadeType.ALL)
     @JoinColumn(name = "bouquet_id")
   // @Column(name = "bouquet_id")
    private Set<Plant> plants = new HashSet<>();

    public Bouquet() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Set<Plant> getPlants() {
        return plants;
    }

    public void setPlants(Set<Plant> plants) {
        this.plants = plants;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bouquet)) return false;

        Bouquet bouquet = (Bouquet) o;

        if (getId() != bouquet.getId()) return false;
        if (getTotalPrice() != bouquet.getTotalPrice()) return false;
        return getPlants() != null ? getPlants().equals(bouquet.getPlants()) : bouquet.getPlants() == null;
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + getTotalPrice();
        result = 31 * result + (getPlants() != null ? getPlants().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Bouquet{" +
                "id=" + id +
                ", totalPrice=" + totalPrice +
                ", plants=" + plants +
                '}';
    }
}
