package com.efremov;

import java.util.List;

public class AleksLion extends Lion {

    private final List<String> friends;
    private final String placeOfLiving;

    public AleksLion() throws Exception {
        super("Самец", null); // В данном случае передаем null, так как CatFamily не используется
        this.friends = List.of("Марти", "Глория", "Мелман");
        this.placeOfLiving = "Нью-Йоркский зоопарк";
    }


    @Override
    public int getKittens() {
        return 0;
    }

    public List<String> getFriends() {
        return friends;
    }

    public String getPlaceOfLiving() {
        return placeOfLiving;
    }
}


