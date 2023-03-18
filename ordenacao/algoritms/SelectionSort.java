package ordenacao.algoritms;

import ordenacao.Sorter;

public class SelectionSort implements Sorter{

    @Override
    public int[] sort(int[] conjunto) {
        int [] sorted = conjunto.clone();

        for (int a = 0; a < sorted.length - 1; a++) {
            int k = a;
            for (int b = a + 1; b < sorted.length; b++)
            {
                if (sorted[b] < sorted[k]) {
                    k = b;
                }
            }
            if (k != a) {
                int ord = sorted[a];
                sorted[a] = sorted[k];
                sorted[k] = ord;
            }
        }
        return sorted;
    }

    @Override
    public String getName() {
        return "SelectionSort";
    }
}
