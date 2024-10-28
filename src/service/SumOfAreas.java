package service;

public class SumOfAreas {

    public double sumOfAreas(Area[] areas){

        double sum = 0;

        for (int i = 0; i < areas.length; i++) {
            sum += areas[i].getSquare();
        }
        return sum;
    }
}
