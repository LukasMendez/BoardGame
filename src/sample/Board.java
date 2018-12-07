package sample;

import javafx.scene.paint.Color;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Board {

    /**
     * The number of squares in a row (horizontally or vertically)
     */
    private final int NUMBEROFSQUARES = 8;
    /**
     * The size of a square in pixels
     */
    private final int SIZEOFSQUARE = 75;

    private final Square [][] squares = new Square[NUMBEROFSQUARES][NUMBEROFSQUARES];


    public Board()
    {
        this.placeAllSquares();
    }

    private void placeAllSquares(){
        int count = 0; // helper

        for (int row = 0; row < NUMBEROFSQUARES; row++)
        {
            for(int col = 0; col < NUMBEROFSQUARES; col++) //
            {

                System.out.println("count = "+count+", row = "+row+", col = "+col);
                count++;

                if (count%2 ==0)
                {
                    squares[row][col] = new Square(SIZEOFSQUARE*col,SIZEOFSQUARE*row,SIZEOFSQUARE, Color.SADDLEBROWN);
                }else
                {
                    squares[row][col] = new Square(SIZEOFSQUARE*col,SIZEOFSQUARE*row,SIZEOFSQUARE, Color.ANTIQUEWHITE);
                }
            }
            count++; // updating the counter, so that the output of modulus will differ

        }
    }
    /**
     * For drawing the board based on squares
     * @return an array of all square objects on this board
     */
    public Square[] getAllSquares() {
        int index = 0;
        Square [] result = new Square[NUMBEROFSQUARES*NUMBEROFSQUARES];

        // TODO nested for loops
        for (int row = 0; row < NUMBEROFSQUARES ; row++) {




            for (int col = 0; col < NUMBEROFSQUARES; col++) {

               // System.out.println("Getting next column in getAllSquares");

                result[index] = squares[row][col];

                index++;

              //  System.out.println("Incrementing index for getAllSquares");

            }

            System.out.println("Finished adding squares from " + (row+1) + ". row!");
            System.out.println("----Getting next row in getAllSquares");



        }

        System.out.println("Finished adding the squares to the array");



        return result; // returns an array with all the data (squares)
    }





}