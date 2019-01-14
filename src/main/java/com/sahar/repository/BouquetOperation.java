package com.sahar.repository;

public class BouquetOperation<Bouquet> extends CrudOperations {
    public BouquetOperation(Class<Bouquet> persistentClass) {
        super(persistentClass);
    }
}
