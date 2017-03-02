package main.shape;

/**
 * Created by Eddie on 2017-03-01.
 */
public interface ShapeBehavior {

    void drawPointToPoint(double posX,double posY);
    void move(double posX,double posY);
    void chagneThickness(double value);
    void scale(double dx,double dy);
}
