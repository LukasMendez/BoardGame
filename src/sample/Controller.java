package sample;

import javafx.fxml.FXML;
import javafx.scene.paint.Color;

public class Controller {



    @FXML
    public void initialize(){

        //TODO METHODS THAT WILL RUN WHEN APPLICATION IS LAUNCHED

        Square sc = new Square(1,1,75, Color.BLACK);

        sc.drawSquare(sc);

        System.out.println("Welcome broder");

    }









}
