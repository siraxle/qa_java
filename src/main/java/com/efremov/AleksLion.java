package com.efremov;

public class AleksLion extends Lion {

    private int roarVolume;

    public AleksLion(String sex, CatFamily feline, int roarVolume) throws Exception {
        super(sex, feline);
        this.roarVolume = roarVolume;
    }

    public int getRoarVolume() {
        return roarVolume;
    }
}

