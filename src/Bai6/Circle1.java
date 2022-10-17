package Bai6;

public class Circle1 {
     public double radius;
     public String color;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public double getArea(){
        return Math.sqrt(this.radius) * Math.PI;
    }
    public String toString() {
        double Circle1Impl = 0;
        return Double.toString(Circle1Impl);


    }
}
