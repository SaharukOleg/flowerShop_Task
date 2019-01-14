package com.sahar.repository;

public class TulipOperation<Tulip> extends CrudOperations {

    public TulipOperation(Class<Tulip> persistentClass) {
        super(persistentClass);
    }
}
