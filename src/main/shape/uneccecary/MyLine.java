package main.shape.uneccecary;

import javafx.scene.shape.Line;
import javafx.scene.shape.Shape;

/**
 * Created by Eddie on 2017-03-01.
 */
public abstract class MyLine extends MyShape{
    private Line line;

    public MyLine() {
        line = new Line();
    }

    @Override
    public Shape draw() {
        // kalla på musklick
        double startX = 0;
        double startY = 0;
        line.setStartX(startX);
        line.setStartY(startY);

        //kalla på musklick igen
        double endX = 100;
        double endY = 100;
        line.setEndX(endX);
        line.setEndY(endY);

        line.setStrokeWidth(100);

        return line;
    }
}
