package Lab;

public class InsertionSort implements  SortStrategy {

    @Override
    public void sort(long[] array) {
        for (int i = 1; i < array.length; i++) {
            long temp = array[i];
            int j = i - 1;
            while(j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }
}
