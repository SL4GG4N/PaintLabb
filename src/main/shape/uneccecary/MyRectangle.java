package main.shape.uneccecary;

import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

/**
 * Created by Eddie on 2017-03-01.
 */
public abstract class MyRectangle extends MyShape{

    public MyRectangle() {
        super(new Rectangle());
    }

    @Override
    public Shape draw() {
        super.getMyShape().setX(100);
        rectangle.setY(100);
        rectangle.setHeight(100);
        rectangle.setWidth(100);

        return rectangle;
    }
}
