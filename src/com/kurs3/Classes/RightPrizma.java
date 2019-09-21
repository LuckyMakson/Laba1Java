package com.kurs3.Classes;

public class RightPrizma extends Square {

    int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height > 0 ? height : 0;
    }

    public RightPrizma(int side, int height) {
        super(side);
        this.setHeight(height);
    }

    public RightPrizma() {
    }

    public double GetVolume() {
        return super.GetSquare() * height;
    }

    public double GetDiagonalePrizma() {
        return side * Math.sqrt(3);
    }

    public static double CheckCorrectHeight(String value) {
        double height = -1;
        try {
            height = Double.parseDouble(value) > 0 ? Double.parseDouble(value) : -1;
        } catch (Exception e) {

        }
        return height;
    }

    @Override
    public double GetSquare() {
        return 2 * super.GetSquare() + 4 * side * height;
    }

    @Override
    public String toString() {
        return "\n" +
                " Side = " + side +
                " height = " + height +
                " Volume = " + GetVolume() +
                " SquarePrizm = " + GetSquare() +
                " Diagonale Prizm = " + GetDiagonalePrizma() +
                "}";
    }
}
