package com.sahar;

import com.sahar.entity.goods.Tulip;
import com.sahar.repository.JdbcFacade;

import java.util.List;


public class Main {
    public static void main(String[] args) {

        JdbcFacade jdbc = new JdbcFacade();
        //  jdbc.driverRegister();

        List<Tulip> tulipsList = jdbc.getAllTulips(); //
//        com.sahar.Shop shop = new com.sahar.Shop();
//        shop.addTulip();
//        shop.addCactus();
//        shop.printAllTulip();
//        shop.printAllCactus();
    }


}
