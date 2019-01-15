package com.sahar.bouquets;

import com.sahar.entity.Plant;
import com.sahar.entity.goods.Tulip;
import com.sahar.repository.BouquetOperation;
import com.sahar.repository.TulipOperation;

import java.util.HashSet;


public class BouquetsCreator {
    public void doB() {
        BouquetOperation bouquetOperation = new BouquetOperation(Bouquet.class);
        TulipOperation tulipOperation = new TulipOperation(Tulip.class);
        //Save saveObj = new Save();

        HashSet<Plant> flowers = new HashSet<>();

        Bouquet bouquet = new Bouquet();
        //       bouquet.setPlants( flowers.add((Tulip) tulipOperation.getObject(3));

        flowers.add((Tulip) tulipOperation.getObject(3));
        flowers.add((Tulip) tulipOperation.getObject(2));
        flowers.add((Tulip) tulipOperation.getObject(1));
        flowers.add((Tulip) tulipOperation.getObject(4));


//
        bouquet.setPlants(flowers);
        bouquetOperation.saveObject(bouquet);
//        bouquetOperation.saveObject(flowers);

//        System.out.println(tulipOperation.getObject(1));
//        System.out.println(tulipOperation.getObject(2));
        //saveObj.saveObject(bouquet);
    }
}
