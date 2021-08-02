package com.alfa.work3;

import java.util.Random;

public class Id {
    private static int nextInt;
    private int id;

    static {
        Random random = new Random();
        nextInt = random.nextInt(100)+1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Id() {
        this.id = nextInt;
        nextInt++;
    }
}
