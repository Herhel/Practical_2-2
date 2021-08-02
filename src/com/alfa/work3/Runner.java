package com.alfa.work3;

public class Runner {
    private Id[] collection;
    public void run(){
        collection = createIds(8);

    }

    public Id[] createIds (int count) {
        Id [] collection = new Id[count];
        for (int i=0; i<count; i++) {
            collection[i] = new Id();
            System.out.println("id = " + collection[i].getId());
        }
        return collection;
    }
}
