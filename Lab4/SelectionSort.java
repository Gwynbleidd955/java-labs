package Lab;


public class SelectionSort implements SortStrategy{

    @Override
    public void sort(long[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for(int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
                long temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
        }
    }
}

