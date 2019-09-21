package com.kurs3.Classes;

public class Square {

    int side;

    public Square() {
    }

    public Square(int side) {
        this.setSide(side);
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side > 0 ? side : 0;
    }

    public int GetPerimetr ()
    {
        return side*4;
    }

    public double GetSquare ()
    {
        return side*side;
    }

    public double GetDiagonale ()
    {
        return side*Math.sqrt(2);
    }

    public static double CheckCorrectSide(String value) {
        double side = -1;
        try {
            side = Double.parseDouble(value) > 0 ? Double.parseDouble(value) : -1;
        } catch (Exception e) {

        }
        return side;
    }

    @Override
    public String toString() {
        return "\n" +
                " side = " + side +
                " Perimetr = " + GetPerimetr() +
                " Diagonale = " + GetDiagonale() +
                " Square = " + GetSquare() +
                '}';
    }
}
