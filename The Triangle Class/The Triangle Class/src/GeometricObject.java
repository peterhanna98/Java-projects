public class GeometricObject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    //Construct a default geometric object
    public GeometricObject() {
        dateCreated = new java.util.Date();
    }

    // Construct a geometric object with the specified color
    // and filled value
    public GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    // Returning color
    public String getColor() {
        return color;
    }

    // Setting a new color
    public void setColor(String color) {
        this.color = color;
    }

    // Returning filled
    public boolean isFilled() {
        return filled;
    }

    // Setting filled
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // Get dateCreated
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    // Return a string representation of this object
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color +
                " and filled: " + filled;
    }
}
