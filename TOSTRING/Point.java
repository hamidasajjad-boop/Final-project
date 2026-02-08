package TOSTRING;

public class Point {
    private int x;
    private int y;
    
    public Point(int initialX, int initialY) {
        this.x = initialX;
        this.y = initialY;
    }
    // accessor methods
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
   public String toString() {
	    return  x + ", " + y;
	 }
    
    public void setLocation(int newX, int newY) {
        x = newX;
        y = newY;
    }

    public void translate(int dx, int dy) {
        setLocation(x + dx, y + dy);
    }
}
