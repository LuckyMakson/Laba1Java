package com.kurs3;

import com.kurs3.Classes.Prizmas;
import com.kurs3.Classes.RightPrizma;
import com.kurs3.Classes.Square;
import com.kurs3.Classes.Squares;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Square square = new Square();
        Squares squares;
        RightPrizma prizma = new RightPrizma();
        Prizmas prizmas;
        Scanner in = new Scanner(System.in);

        System.out.printf("Enter num Square: ");
        int numSquares = in.nextInt();
        squares = new Squares(numSquares);

        System.out.printf("Enter num Prizma: ");
        int numPrizmas = in.nextInt();
        prizmas = new Prizmas(numPrizmas);

        int side;
        for (int i = 0; i < numSquares; i++) {
            side = -1;
            while (square.CheckCorrectSide("" + (side = (int) (Math.random() * 11 - 5))) < 0) {
            }
            square = new Square(side);
            squares.setSquareAt(i,square);
        }

        int height;
        for (int i = 0; i < numPrizmas; i++) {
            side = -1;
            height = -1;
            while (prizma.CheckCorrectSide("" + (side = (int) (Math.random() * 11 - 5))) < 0 ||
                    prizma.CheckCorrectHeight("" + (height = (int) (Math.random() * 11 + 5))) < 0) {
            }
            prizma = new RightPrizma(side, height);
            prizmas.setPrizmaAt(i, prizma);
        }

        System.out.println(squares.toString() + "\n" + prizmas.toString());

        System.out.println("\n Квадрат с максимальной площадью: " + squares.getSquares()[squares.maxSquare()]);
        System.out.printf("\n Призма с максимальной диагональю: " + prizmas.getPrizmas()[prizmas.maxDiagonale()]);
    }



}