package example2;

public class Character implements Movable{

    public void stepAhead() {

    }
    public void turnLeft() {

    }
    public void turnRight() {

    }
    public void turnAround() {
        turnLeft();
        turnLeft();
    }
}
