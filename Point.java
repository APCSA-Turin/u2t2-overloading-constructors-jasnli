public class Point {

    //INSTANCE VARIABLES
    private int x;
    private int y;

    //CONSTRUCTORS

    //PT ASSIGNMENT
    public Point(int x, int y) {
    this.x = x;
    this.y = y;     
    }

    //SAME FOR BOTH
    public Point(int point) {
    x = point;
    y = point;
    }

    //ORIGIN
    public Point() {
        x = 0;
        y = 0;
    }


    // GETTERS
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }

    //SETTERS
    public void setX(int newX) {
        x = newX;
    }

    public void setY(int newY) {
        y = newY;
    }

    //COORD
    public String coordinate() {
        return "(" + x + ", " + y + ")";
    }

    public String quadrant() {
        if (x > 0 && y > 0) {
            return "I";
        } if (x < 0 && y > 0) {
            return "II";
        } if (x < 0 && y < 0) {
            return "III";
        } if (x > 0 && y < 0) {
            return "IV";
        } if (x == 0 && y != 0) {
            return "on an axis";
        } if (y == 0 && x != 0) {
            return "on an axis";
        } else {
            return "origin";
        }
    }

}
