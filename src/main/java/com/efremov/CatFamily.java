package com.efremov;

import java.util.List;

public interface CatFamily {
    int getKittens();

    boolean doesHaveMane();

    List<String> getFood() throws Exception;
}
