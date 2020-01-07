    
public class BubbleInsertion_20791164 {
    public static void main(String[] args) {
        int[] vetorBubbleSort = {50, 25, 30, 85, 0, -1, 25, 85, 80};
        int[] vetorInsertionSort = {8, 58, 13, 0, 58, 31, 52, 5};
        /*
            -   Implementar os dois algoritmos:
                1 - Bubble Sort versão otimizada (segunda versão)
                2 - Insertion Sort
             
            -   Printar os vetores de entrada antes e depois da chamada de cada um dos métodos.
            
            -   ENTREGAR APENAS 1 ARQUIVO .JAVA CONTENDO TUDO.
        */
        System.out.print("Vetor Bubble Sort antes de ordenar: ");
        for(int a : vetorBubbleSort){
            System.out.print(a + " ");
        }
        System.out.print("\nVetor Bubble Sort depois de ordenar: ");
        for(int a : BubbleSort(vetorBubbleSort)){
            System.out.print(a + " ");
        }
        
        System.out.print("\n\nVetor Insertion Sort antes de ordenar: ");
        for(int a : vetorInsertionSort){
            System.out.print(a + " ");
        }
        System.out.print("\nVetor Insertion Sort depois de ordenar: ");
        for(int a : InsertionSort(vetorInsertionSort)){
            System.out.print(a + " ");
        }
        
    }
    
    public static int[] BubbleSort(int[] vetor){ 
        int n = vetor.length;
        
        do{
        int newN = 0;
        
        for(int i = 1; i <= n-1; i++){
            if(vetor[i-1]> vetor[i]){
                int auxiliar = vetor[i-1];
                vetor[i-1] = vetor[i];
                vetor[i] = auxiliar;
                newN = i;
            }
            
        }
        n = newN;
        } while(n!=0);
        
        return vetor;
    }
    
    public static int[] InsertionSort(int[] vetor){
        int n = vetor.length;
        int j;
        for(int i = 1;i <= n-1; i++){
            j = i;
            while(j > 0 &&  vetor[j-1] > vetor[j]){
                int auxiliar = vetor[j-1];
                vetor[j-1] = vetor[j];
                vetor[j] = auxiliar;
                j = j-1;
            }
        }
        
        return vetor;
    }
    
    
    
}
