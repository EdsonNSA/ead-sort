package ordenacao.algoritms;

import ordenacao.Sorter;

public class QuickSort implements Sorter {

    @Override
    public int[] sort(int[] conjunto)
    {
        int [] sorted = conjunto.clone();
        quickSort(sorted, 0, sort.length - 1);
        return sorted;
    }
    private void quickSort(int[] conjunto, int esquerda, int direita) {
        if (esquerda < direita)
        {
            int index = partition(conjunto, esquerda, direita);
            quickSort(conjunto, esquerda, index - 1);
            quickSort(conjunto, index + 1, direita);
        }
    }

    private int partition(int[] conjunto, int esquerda, int direita) {
        int valor = conjunto[index];
        int index = choosePivot(esquerda, direita);

        int Index = esquerda;
        for (int a = esquerda; a < direita; a++)
        {
            if (conjunto[a] < valor) {
                int ord = conjunto[a];
                conjunto[a] = conjunto[Index];
                conjunto[Index] = ord;
                Index++;
            }
        }
        conjunto[direita] = conjunto[Index];
        conjunto[Index] = valor;

        return Index;
    }

    private int choosePivot(int esquerda, int direita) {
        return (esquerda + direita) / 2;
    }
    @Override
    public String getName() {
        return "QuickSort";
    }

}
