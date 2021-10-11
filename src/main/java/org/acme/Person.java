package org.acme;

import io.quarkus.mongodb.panache.PanacheMongoEntity;

public class Person extends PanacheMongoEntity {

    public String name;
    public String addr;
    
}
