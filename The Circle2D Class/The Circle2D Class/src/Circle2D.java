public class Circle2D {

    //Data fields
    private double x;
    private double y;
    private double radius;

    // No-arg constructor to create a default circle with
    // (0,0) for x,y and 1 for radius

    Circle2D() {

        this(0, 0, 1);
    }
    // Creates a circle with the specified x, y, and radius.
    Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    // Returning x
    public double getX() {
        return x;
    }
    // Returning Y
    public double getY() {
        return y;
    }
    // Returning radius
    public double getRadius() {
        return radius;
    }
    // Returning the area of the circle
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
   // Returning the perimeter of the circle
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    // Return true if the specified point
    // (x, y) is inside this circle
    public boolean contains(double x, double y) {
        return Math.sqrt(Math.pow(x - this.x, 2) +
                Math.pow(y - this.y, 2)) < radius;
    }
    // Return true if the specified
    // circle is inside this circle
    public boolean contains(Circle2D circle) {
        return Math.sqrt(Math.pow(circle.getX() - x, 2) +
                Math.pow(circle.getY() - y, 2))
                <= Math.abs(radius - circle.getRadius());
    }
    // Return true if the specified
    // circle overlaps with this circle
    public boolean overlaps(Circle2D circle) {
        return Math.sqrt(Math.pow(circle.getX() - x, 2) +
                Math.pow(circle.getY() - y, 2))
                <= radius + circle.getRadius();
    }
}
