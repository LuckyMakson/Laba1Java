package com.kurs3.Classes;

import java.util.Arrays;

public class Prizmas {
    public RightPrizma[] getPrizmas() {
        return prizmas;
    }

    public void setPrizmaAt(int index, RightPrizma prizma) {
        prizmas[index] = prizma;
    }

    private RightPrizma[] prizmas;

    public Prizmas() {
        prizmas = new RightPrizma[0];
    }

    public Prizmas(int length) {
        this.prizmas = new RightPrizma[length];
    }

    public int maxDiagonale() {
        int maxIndex = 0;
        for (int i = 0; i < prizmas.length; i++) {
            if (prizmas[maxIndex].GetSquare() < prizmas[i].GetSquare())
                maxIndex = i;
        }
        return maxIndex;
    }

    @Override
    public String toString() {
        return "Prizmas{" +
                "prizmas=" + Arrays.toString(prizmas) +
                '}';
    }
}
