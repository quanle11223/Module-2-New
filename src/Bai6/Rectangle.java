package Bai6;

public class Rectangle extends Shape{
    double width = 1;
    double height = 1;

    public Rectangle() {
    }
    public Rectangle(double width, double height){
        this.height = height;
        this.width = width;
    }
    public Rectangle(double width, double height,String color, boolean filled){
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return getHeight()*getWidth();
    }
    public double getPerimeter(){
        return (getHeight()+getWidth()) * 2;
    }
    @Override
    public String toString() {
        return "A rectangle with width"
                + getWidth()
                +"and"
                + getHeight()
                +"Which is a subclass of"
                + super.toString() ;
    }
}
