package Seminar_1;

public class Shapes {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(4.0, 10.0, " green ");
        Triangle t2 = new Triangle(3.0, 25.0, " write ");
        TwoShape t3 = new TwoShape(4.2, 8.9);
        Triangle t4 = new Triangle(14.2, 12.0);
        TwoShape t5 = new TwoShape();

//        t1.setHeigth(4.0);
//        t1.setWidth(10 / 1);
//        t1.style = "green";
//
//        t2.setHeigth(4.0);
//        t2.setWidth(10 / 1);
//        t2.style = "write";

        System.out.println(" Информация от t1 ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Площадь равно " + t1.area());

        System.out.println(" Информация от t2 ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Площадь равно " + t2.area());

    }
}
