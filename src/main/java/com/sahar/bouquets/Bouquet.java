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

    //  private List<Plant> plantList;
    //   @Column(name = "wrapper")
    // private Wrapper wrapper;
    private int totalPrice;


    @OneToMany(mappedBy = "bouquet", fetch = FetchType.EAGER)
    // @JoinColumn(name = "flower_id")
   @Column(name = "plant_id")
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
    public String toString() {
        return "Bouquet{" +
                "id=" + id +
                ", plants=" + plants +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
