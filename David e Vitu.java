package javaapplication11;

public class JavaApplication11 {

    public static void main(String[] args) {
        
        int[] vetorBubbleSort = {50, 25, 30, 85, 0, -1, 25, 85, 80};
        int[] vetorInsertionSort = {8, 58, 13, 0, 58, 31, 52, 5};

        System.out.println("Vetor selection desordenado:");

        for (int i = 0; i < vetorBubbleSort.length; i++) {

            System.out.print(vetorBubbleSort[i] + " | ");
        }

        SelectionSort(vetorBubbleSort);

        System.out.println("\nVetor selection ordenado:");
        for (int i = 0; i < vetorBubbleSort.length; i++) {
            System.out.print(vetorBubbleSort[i] + " | ");
        }

        System.out.println("\nVetor merge desordenado:");
        for (int i = 0; i < vetorInsertionSort.length; i++) {

            System.out.print(vetorInsertionSort[i] + " | ");
        }

        MergeSort(vetorInsertionSort, 0, 7);

        System.out.println("\nVetor merge ordenado:");
        for (int i = 0; i < vetorInsertionSort.length; i++) {
            System.out.print(vetorInsertionSort[i] + " | ");
        }
    }

    public static int[] SelectionSort(int[] vetor) {
        int aux = 0;
        int menor = 0;

        for (int i = 0; i <= vetor.length - 1; i++) {
            menor = i;

            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[menor]) {
                    menor = j;
                }
            }

            aux = vetor[i];
            vetor[i] = vetor[menor];
            vetor[menor] = aux;
        }
        return vetor;
    }

    public static int[] MergeSort(int[] vetor, int menor, int maior) {

        if (menor < maior) {

            int meio = (menor + maior) / 2;

            MergeSort(vetor, menor, meio);
            MergeSort(vetor, meio + 1, maior);
            Intercala(vetor, menor, meio, maior);

        }

        return vetor;
    }

    public static void Intercala(int[] vetor, int menor, int meio, int maior) {

        int[] aux = new int[vetor.length];
        int i, j;

        for (i = menor; i <= meio; i++) {
            aux[i] = vetor[i];
        }

        for (j = meio + 1; j <= maior; j++) {
            aux[maior + meio + 1 - j] = vetor[j];
        }

        i = menor;
        j = maior;

        for (int k = menor; k <= maior; k++) {

            if (aux[i] <= aux[j]) {
                vetor[k] = aux[i];
                i = i + 1;
            } else {

                vetor[k] = aux[j];
                j = j - 1;
            }

        }
    }

}
