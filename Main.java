package Lab;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        long[] numbers = {9, 3, 5, 6, 1, 2, 4, 8, 7};
        long[] numbers1 = {14, 19 ,16 ,17, 11, 12, 18, 13, 15 };
        Sorter sorter = new Sorter(new SelectionSort());
        sorter.sort(numbers);
        System.out.println("Selection sort: " + Arrays.toString(numbers));
        sorter.setStrategy(new InsertionSort());
        sorter.sort(numbers1);
        System.out.println("Insertion sort: " + Arrays.toString(numbers1));

    }
}
