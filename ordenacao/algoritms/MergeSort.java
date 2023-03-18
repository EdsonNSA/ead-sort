package ordenacao.algoritms;

import ordenacao.Sorter;

public class MergeSort implements Sorter {

    @Override
    public int[] sort(int[] conjunto)
    {
        int [] sorted = conjunto.clone();
        mergeSort(sorted, 0, sorted.length - 1);
        return sorted;
    }

    private void mergeSort(int[] conjunto, int começo, int fi) {
        if (começo<fim) 
        {
            int metade = (começo+fim)/2;
            mergeSort(conjunto, começo, metade);
            mergeSort(conjunto, metade+1, fim);
            junçao(conjunto, começo, metade, fim);
        }
    }

    private void junçao(int[] conjunto, int começo, int metade, int fim) {
        int[] direta = new int[fim - metade];
        int[] esquerda = new int[metade - começo + 1];

        for (int a = 0; a < esquerda.length; a++)
        {
            esquerda[a] = conjunto[começo + a];
        }
        for (int b = 0; b < direita.length; b++)
        {
            direita[b] = conjunto[metade + 1 + b];
        }

        int a = 0;
        int b = 0;

        while (a < esquerda.length && b < direita.length) {
            if (esquerda[a] <= direita[b]) 
            {
                conjunto[começo] = esquerda[a];
                a++;

            }else 
            {
                conjunto[começo] = direita[b];
                b++;
            }
            começo++;
        }

        while (a < esquerda.length) {
            conjunto[começo] = esquerda[a];
            a++;
            começo++;
        }

        while (b < direita.length) {
            conjunto[começo] = direita[b];
            b++;
            começo++;
        }
    }

    @Override
    public String getName() {
        return "MergeSort";
    }

}
