package by.epam.javatraining.bialiatskaya.lessons.lesson20190802;

public class Lesson20190802 {

    private double a;
    private double b;
    private double[] array;

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setArray(double[] array) {
        this.array = array;
    }

    public Lesson20190802(double a, double b, double[] array){
        setA(a);
        setB(b);
        setArray(array);

        if (isArray() && isNatural()) {
            sortAB();
            findEverything();
        }
    }

    /* Sort a and b at increasing order */
    void sortAB() {
        if (a > b) {
            double n = a;
            a = b;
            b = n;
        }
    }

    public Lesson20190802() {
        System.out.println("Nothing happened");
    }

    /* Define whether array exists*/
    boolean isArray() {
        if (array == null) {
            System.out.println("Array is null");
            return false;
        } else {
            return true;
        }
    }

    /* Define whether number n is natural*/
    boolean isNatural(){
        if (array.length > 0) {
            return true;
        } else {
            System.out.println("Array lenght is not natural number");
            return false;
        }
    }

    /* Method to define everything int the task*/
    void findEverything(){
        int quantity = quantityFromA_ToB();
        System.out.println("Quantity of elements between " + a + " and " + b + " is " + quantity);

        double sum = SumAfterMax();
        System.out.println("Sum of elements after element with max value is " + sum);
    }

    /* Quantity of elements between values a and b */
    int quantityFromA_ToB(){
        int quantity = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > a && array[i] < b)
                quantity++;
        }

        return quantity;
    }

    /* Find index of the max element */
    int maxIndex (){
        int max = 0;
        for (int i = 1; i < array.length; i++){
            if (array[i] > array[max])
                max = i;
        }

        return max;
    }

    /* Calculate sum of elements laying after the max element */
    double SumAfterMax() {
        int maxNext = maxIndex() + 1; // index of the next element after MAX
        double sum = 0;

        for (int i = maxNext; i < array.length; i++) {
            sum += array[i];
        }

        return sum;
    }
}
