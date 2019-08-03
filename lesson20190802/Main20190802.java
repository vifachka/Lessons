package by.epam.javatraining.bialiatskaya.lessons.lesson20190802;

public class Main20190802 {

    public static void main(String[] arg) {
        Lesson20190802 lesson1 = new Lesson20190802();
        double[] nullArray3 = null;
        Lesson20190802 lesson2 = new Lesson20190802(8.456, 0.987, nullArray3);
        double[] nullArray4 = new double[0];
        Lesson20190802 lesson3 = new Lesson20190802(0, 0, nullArray4);
        Lesson20190802 lesson4 = new Lesson20190802(2.345, 5.432, new double[] {1.1, 2.2, 7.7, 19, 2.4, 3.3, 0});
        Lesson20190802 lesson5 = new Lesson20190802(8.456, 0.987, new double[] {1.1, 2.2, 7.7, 19, 2.4, 3.3, 0});
    }
}
