package Seminar_1;

public class TwoShape {
     private double width;

    private double heigth;
    TwoShape(double width, double heigth) {
        this.heigth = heigth;
        this.width = width;
    }

    TwoShape() {
        width = heigth = 0.0;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public double getWidth() {
        return width;
    }

    public double getHeigth() {
        return heigth;
    }

    void showDim() {
        System.out.println(" Ширина и высота " + width + " и " + heigth);
    }
}

class Triangle extends TwoShape {
    String style;

    Triangle(double width, double heigth, String style) {
        super(width, heigth);
        this.style = style;
    }

    Triangle(double width, double heigth) {
        super(width, heigth);
    }

    double area() {
        return(getWidth() * getHeigth() / 2);
    }
    void showStyle() {
        System.out.println(" Треугольник " + style);
    }
}
