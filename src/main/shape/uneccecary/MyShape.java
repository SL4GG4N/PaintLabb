package main.shape.uneccecary;


import javafx.scene.shape.Shape;

/**
 * Created by Eddie on 2017-03-01.
 */
public abstract class MyShape extends Shape{
    private Shape shape;

    public MyShape(Shape shape) {
        this.shape = shape;
    }

    public Shape getMyShape() {
        return shape;
    }

    public void setMyShape(Shape shape) {
        this.shape = shape;
    }

    public MyShape draw() {
        return null;
    }

    public void remove(double posX, double posY) {
        // add to revert if in position

    }

    public MyShape copy() {
        return null;
    }

    public void move(double posX, double posY){

    }
}
