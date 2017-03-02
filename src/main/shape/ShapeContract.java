package main.shape;

import main.shape.uneccecary.MyShape;

import java.util.ArrayList;

/**
 * Created by Eddie on 2017-03-01.
 */
public interface ShapeContract {
    ArrayList<MyShape> getShapes(); // a copy of the list
    void addShape(MyShape shape);
    void removeShape(MyShape shape);
    //void editShape(Shape original, Shape edited);
    void moveShape(MyShape shape, double posX, double posY);

}
