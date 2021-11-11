package uk.cam.ac.bta30.Vector2D;

public class Vector2D {
    private double x, y;

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void add(Vector2D other) {
        x += other.x;
        y += other.y;
    }

    public double scalarProduct(Vector2D other) {
        return x * other.x + y * other.y;
    }

    public double magnitude() {
        return Math.sqrt(x*x + y*y);
    }

    public void normalise() {
        double mag = magnitude();
        x /= mag;
        y /= mag;
    }
}
