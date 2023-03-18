package ordenacao.algoritms;

import ordenacao.Sorter;

public class InsertionSort implements Sorter{

    @Override
    public int[] sort(int[] conjunto) {
        int [] sorted = conjunto.clone();

        for (int a = 1; a < sorted.length; a++) {
            int j = sorted[a];
            int b = a - 1;
            while (b >= 0 && sorted[b] > j) {
                sorted[b + 1] = sorted[b];
                b--;
            }
            sorted[b + 1] = j;
        }

        
    }

    @Override
    public String getName() {
        return "InsertionSort";
    }

}
