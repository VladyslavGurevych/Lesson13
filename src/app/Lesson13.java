package app;

import service.Area;
import service.SumOfAreas;

public class Lesson13 {
    public static void main(String[] args) {

        Area quadrate = new Square(13);
        Area triangular = new Triangle(10, 8);
        Area round = new Circle(15);
        SumOfAreas count = new SumOfAreas();

        Area[] areas = new Area[] {quadrate, triangular, round};
        System.out.println("Сума всіх площ дорівнює " + count.sumOfAreas(areas));

    }
}
