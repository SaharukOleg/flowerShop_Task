package com.sahar.wrapper;

import com.sahar.repository.CrudOperations;

public class WrapperOperation<Wrapper> extends CrudOperations {
    public WrapperOperation(Class<Wrapper> persistentClass) {
        super(persistentClass);
    }
}
