package com.sahar;

import com.sahar.entity.Plant;
import com.sahar.entity.enums.Color;
import com.sahar.entity.enums.TulipType;
import com.sahar.entity.goods.Tulip;
import com.sahar.wrapper.Wrapper;
import com.sahar.wrapper.WrapperType;

import java.util.ArrayList;
import java.util.List;

public class Shop {

//    List<Wrapper> wrapperList = new ArrayList<>();
//    public void add(){
//        wrapperList.add(new Wrapper(WrapperType.PAPER_COWER, Color.YELLOW,50));
//    }
//    List<Tulip> tulipList = new ArrayList<>(); // список для тюльпанів
//    List<Cactus> cactusList = new ArrayList<>();// список кактусів
//
//
//    public void addTulip() {
//        tulipList.add(new Tulip(TulipType.TERRY, "Тюльпан", 00.99, Color.YELLOW));
//        tulipList.add(new Tulip(TulipType.TERRY, "Тюльпан", 00.99, Color.YELLOW));
//        tulipList.add(new Tulip(TulipType.TERRY, "Тюльпан", 1.99, Color.BLUE));
//        tulipList.add(new Tulip(TulipType.TERRY, "Тюльпан", 1.99, Color.VIOLET));
//    }
//
//    public void addCactus() {
//        cactusList.add(new Cactus(CactusType.GARDEN_CACTUS, "Суперкактус", 99.25, Color.GREEN));
//        cactusList.add(new Cactus(CactusType.GARDEN_CACTUS, "Суперкактус", 99.25, Color.GREEN));
//        cactusList.add(new Cactus(CactusType.GARDEN_CACTUS, "Суперкактус", 99.25, Color.GREEN));
//        cactusList.add(new Cactus(CactusType.HOME_CACTUS, "Декорний кактус", 59.25, Color.GREEN));
//    }
//
//    public void printAllTulip() {
//        tulipList.forEach(System.out::println);
//        numberOfTulipColors(tulipList); // викликав шоб порахувало кількість всіх кольорів тюляпанів
//    }
//
//    public void printAllCactus() {
//
//        cactusList.forEach(System.out::println);
//        numberOfCactus(cactusList);
//    }
//
//    public void numberOfTulipColors(List<Tulip> tulipList) { // рахує скільки в нас є квітків кожного кольору
//        int yellow_I = 0, blue_I = 0, violet_I = 0, green_I = 0, pink_I = 0, red_I = 0, white_I = 0;
//
//        for (int i = 0; i < tulipList.size(); i++) {
//            switch (tulipList.get(i).getColor()) {
//                case YELLOW:
//                    yellow_I += 1;
//                    break;
//                case VIOLET:
//                    violet_I += 1;
//                    break;
//                case BLUE:
//                    blue_I += 1;
//                    break;
//                case PINK:
//                    pink_I += 1;
//                    break;
//                case RED:
//                    red_I += 1;
//                    break;
//                case GREEN:
//                    green_I += 1;
//                    break;
//                case WHITE:
//                    white_I += 1;
//                    break;
//            }
//        }
//        System.out.println("Кількість жовтих " + yellow_I);
//        System.out.println("Кількість фіолетових " + violet_I);
//        System.out.println("Кількість голубих " + blue_I);
//        System.out.println("Кількість розових " + pink_I);
//        System.out.println("Кількість червоних " + red_I);
//        System.out.println("Кількість зелених " + green_I);
//        System.out.println("Кількість білих " + white_I);
//    }
//
//    public void numberOfCactus(List<Cactus> cactusList) {
//        int cout_garden_cactus = 0;
//        int cout_home_cactus = 0;
//        for (int i = 0; i < cactusList.size(); i++) {
//            switch (cactusList.get(i).getCactusType()) {
//                case GARDEN_CACTUS:
//                    cout_garden_cactus += 1;
//                    break;
//                case HOME_CACTUS:
//                    cout_home_cactus += 1;
//                    break;
//            }
//        }
//        System.out.println("Кількість садових кактусів "+cout_garden_cactus);
//        System.out.println("кількість домашніх кактусів "+cout_home_cactus);
//    }
//

    List<Plant> plantList = new ArrayList<>();
    Tulip tulip;

    public Shop(List<Plant> plantList) {
        this.plantList = plantList;
    }
    public List<Plant> getPlantList() {
        return plantList;
    }
//    public List<Plant> getPlants() {
//        for (Plant plant : plantList) {
//            if (tulip instanceof Plant && tulip.getTulipType() == TulipType.TERRY) { // тут
//                plantList.add(tulip);
//            }
//        }
//        return plantList;
//    }
}
