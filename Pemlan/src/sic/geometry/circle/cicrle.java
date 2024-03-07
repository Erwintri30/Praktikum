package sic.geometry.circle;

public class cicrle {
    private double radius;

    public void setRadius(double radiusR) {
        radius = radiusR;
    }

    public double getRadius() {
        return radius;
    }

    public double luasLingkaran() {
        return Math.PI * (radius * radius);
    }

    public double kelLingkaran() {
        return 2 * Math.PI * radius;
    }

}
