package sample;

import javafx.scene.paint.Color;

public class Square {


    private int positionX;
    private int positionY;
    private final int SIZE;
    private Color color;



    public Square(int positionX, int positionY, int size, Color color){

        this.positionX=positionX;
        this.positionY=positionY;
        this.SIZE=size;
        this.color=color;


    }

    public int getPositionX(){
        return this.positionX;
    }

    public int getPositionY(){
        return this.positionY;
    }

    public int getSIZE(){
        return this.SIZE;
    }

    public Color getColor(){
        return color;
    }


}
