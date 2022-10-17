package Bai6;

public class Circle1Impl extends Circle1 {
    public double height;


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return super.getArea();
    }
    public double getVolume(){
        return getArea() * getHeight();
    }
    public String toString(){
        double Circle1 = 0;
        Circle1Impl circle1 = new Circle1Impl();
        System.out.println(circle1.toString());
        return Double.toString(Circle1);

    }
}
