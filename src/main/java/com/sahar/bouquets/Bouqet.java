package com.sahar.bouquets;

import com.sahar.entity.Plant;
import com.sahar.pack.Pack;

import java.util.List;

public class Bouqet {
    private List<Plant> plants;
    private List<Pack> packs;
    private int totalPrice = 0;

    public Bouqet(List<Plant> plants, List<Pack> packs) {
        this.plants = plants;
        this.packs = packs;
        calculateTotalPrice();
    }

    public List<Plant> getPlants() {
        return plants;
    }

    public void setPlants(List<Plant> plants) {
        this.plants = plants;
        calculateTotalPrice();
    }

    public List<Pack> getPacks() {
        return packs;
    }

    public void setPacks(List<Pack> packs) {
        this.packs = packs;
        calculateTotalPrice();
    }

    public int getTotalPrice() {
        calculateTotalPrice();
        return totalPrice;
    }

    public String getFormattedPrice() {
        return String.valueOf(getTotalPrice()/100.0);
    }

    private void calculateTotalPrice() {
        for (Plant plant : plants) {
            totalPrice += plant.getPrice();
        }

        for (Pack pack : packs) {
            totalPrice += pack.getPrice();
        }
    }

    @Override
    public String toString() {
        return "Bouqet{" +
                "plants=" + plants +
                ", packs=" + packs +
                ", totalPrice=" + getFormattedPrice() +
                '}';
    }
}
