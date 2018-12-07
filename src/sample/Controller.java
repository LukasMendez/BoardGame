package sample;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Controller {

    private Board board; // New board

    @FXML
    private Canvas canvasBackground;

    @FXML
    private Canvas canvasForeground;


    @FXML
    private void initialize(){

        board = new Board(); // Adding a new object from the Board class

        drawBoard(); // Running the draw board method


    }

    /**
     * This method will take a square one by one from the array, that we created in the getAllSquares-method.
     * We are using an enhanced for-loop to go through each element of the array.
     * Each square has its own properties, that will be given to the drawSquare-method.
     * The drawSquare-method will then draw the square on the board based on the information.
     *
     */

    private void drawBoard(){

        for (Square s : this.board.getAllSquares()) /* Takes each object in the array (Notice that getAllSquares actually returns an array )
        This is why we can use an enhanced for loop*/
        {

            drawSquare(s); // The variable s is actually a square with predefined properties (such as coordinates)
            // Since we are using the getAllSquares-method a new square will be provided for each iteration

        }

    }

    /**
     * This method receives an object and draws it according to its properties.
     * We get this information by using the "getters" from the class Square.
     * @param square The square object
     */

    private void drawSquare(Square square){

        GraphicsContext gc = canvasBackground.getGraphicsContext2D();

        gc.setFill(square.getColor()); // We need to set the color before we paint it. We get the color from the object

        gc.fillRect(square.getPositionX(),square.getPositionY(),square.getSIZE(),square.getSIZE());




    }












}
