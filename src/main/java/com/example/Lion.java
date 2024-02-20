package com.example;

import java.util.List;

public class Lion implements CatFamily {

    private boolean hasMane;
    private CatFamily feline;

    public Lion(String sex, CatFamily feline) throws Exception {
        this.feline = feline;

        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }

    @Override
    public int getKittens() {
        return feline.getKittens();
    }

    @Override
    public boolean doesHaveMane() {
        return hasMane;
    }

    @Override
    public List<String> getFood() throws Exception {
        return feline.getFood();
    }
}
