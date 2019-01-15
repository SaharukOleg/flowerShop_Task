package com.sahar;

import com.sahar.bouquets.Bouquet;
import com.sahar.bouquets.BouquetsCreator;
import com.sahar.entity.enums.Color;
import com.sahar.entity.enums.TulipType;
import com.sahar.entity.goods.Tulip;
import com.sahar.repository.TulipOperation;
import com.sahar.wrapper.Wrapper;
import com.sahar.wrapper.WrapperOperation;
import com.sahar.wrapper.WrapperType;

import java.util.ArrayList;
import java.util.List;


public class Main {

//        JdbcFacade jdbc = new JdbcFacade();
//        //  jdbc.driverRegister();
//
//        List<Tulip> tulipsList = jdbc.getAllTulips(); //
////        com.sahar.Shop shop = new com.sahar.Shop();
////        shop.addTulip();
////        shop.addCactus();
////        shop.printAllTulip();
////        shop.printAllCactus();
//    }

    List<Bouquet> bouquetList = new ArrayList<>();

    public void addBouqet() {

    }

    public static void main(String[] args) {
        //(Працює)
        TulipOperation tulipOperation = new TulipOperation(Tulip.class);
        tulipOperation.saveObject(new Tulip(TulipType.TERRY, "Махра", 1.99, Color.RED));  // додаю тюльпани в БД
        tulipOperation.saveObject(new Tulip(TulipType.TERRY, "Маппппра", 1.99, Color.RED));
        tulipOperation.saveObject(new Tulip(TulipType.PIONEER, "Піоновидний", 2.99, Color.VIOLET));
        tulipOperation.saveObject(new Tulip(TulipType.LILIUM, "Новий", 2.99, Color.GREEN));

        WrapperOperation wrapperOperation = new WrapperOperation(Wrapper.class);
        wrapperOperation.saveObject(new Wrapper(WrapperType.PAPER_COWER, Color.YELLOW, 15));
        wrapperOperation.saveObject(new Wrapper(WrapperType.PAPER_COWER, Color.VIOLET, 35));

        //    отримати тюльпан (Працює)
//        Tulip tulip = (Tulip) tulipOperation.getObject(3);
//        System.out.println(tulip);

        BouquetsCreator bouquetsCreator = new BouquetsCreator();
        bouquetsCreator.doB();
        //BouquetOperation bouquetOperation = new BouquetOperation(Bouquet.class);
        //System.out.println(bouquetOperation.getObject(1));

//        System.out.println(tulipOperation.getObject(3));
//
//        //отримати обгортку (Працює)
//        System.out.println(wrapperOperation.getObject(2));
//


        //оновлення даних в тюльпані (ше треба доробити )
//        Tulip tulip2 =tulipOperation.updateTulip(tulip);
//           System.out.println(tulip);

        //(працює)
        // видаляє обєкт з БД (але щоб його видалити то спочатку його треба отримати )
//        wrapperOperation.getObject(3);
//        wrapperOperation.deleteObject(3);
        //     wrapperOperation.deleteObject(2);
        //   wrapperOperation.deleteObject(3);


    }
}