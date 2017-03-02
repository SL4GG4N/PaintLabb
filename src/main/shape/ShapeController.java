package main.shape;

import javafx.scene.shape.Shape;
import main.shape.uneccecary.MyShape;

import java.util.ArrayList;

/**
 * Created by Eddie on 2017-03-01.
 */
public class ShapeController implements ShapeContract{
    private ArrayList<Shape> shapes;
    private ShapeBehavior sb;

    @Override
    public ArrayList<MyShape> getShapes() {
        return (ArrayList<MyShape>) shapes.clone();
    }

    @Override
    public void moveShape(MyShape shape, double posX, double posY) {
       /* MyShape tmp = shapes.stream().filter( x -> x.equals(shape)).findFirst().orElse(null);
        if (tmp == null){
            return;
        }
        tmp.move(posX, posY);*/
       //sb.move();
    }

    @Override
    public void addShape(MyShape shape) {
        shapes.add(shape);
    }

    @Override
    public void removeShape(MyShape shape) {

    }
}
