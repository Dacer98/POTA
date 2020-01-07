
public class SelectionMerge_20791164 {
    public static void main(String[] args) {
        int[] vetorSelection = {50, 25, 30, 12, 85, 0, -1, 25, 85, 80};
        int[] vetorMerge = {8, 58, 13, 0, 58, 31, 52, 5, 25, 66, 9};
        
        System.out.print("Vetor Selection antes de ordenar: ");
        for(int a : vetorSelection){
            System.out.print(a + " ");
        }
        System.out.print("\nVetor Selection depois de ordenar: ");
        for(int a : SelectionSort(vetorSelection)){
            System.out.print(a + " ");
        }
        
        System.out.print("\n\nVetor Merge antes de ordenar: ");
        for(int a : vetorMerge){
            System.out.print(a + " ");
        }
        System.out.print("\nVetor Merge depois de ordenar: ");
        for(int a : MergeSort(vetorMerge,0,vetorMerge.length-1)){
            System.out.print(a + " ");
        }
    }
    
    public static int[] SelectionSort(int[] vetor){
        int auxiliar = 0, menor = 0;

	for (int i = 0; i <= vetor.length-1; i++) {
            menor = i;
	for (int j = i+ 1; j < vetor.length; j++) {
            if (vetor[j] < vetor[menor]) {
		menor = j;
            }
	}
            auxiliar = vetor[i];
            vetor[i] = vetor[menor];
            vetor[menor] = auxiliar;       
        }
        return vetor;
    }
    
    
    public static int[] MergeSort(int[] vetor, int p, int r){
        if(p < r){
            int q = (p + r)/2;
                MergeSort(vetor, p, q);
                MergeSort(vetor, q + 1, r);
                Intercala(vetor, p, q, r);
        }
        return vetor;
    }
    
    public static void Intercala(int[]vetor, int p, int q, int r){
      int[] auxiliar = new int[vetor.length];
        int i, j;
        for(i = p; i <= q; i++){
            auxiliar[i] = vetor[i];
        }
        
        for(j = q+1; j <= r; j++){
            auxiliar[r+q+1-j] = vetor[j];
        }
        
        i = p;
        j = r;
        
        for(int k = p; k <= r; k++){
            if(auxiliar[i] <= auxiliar[j]){
                vetor[k] = auxiliar[i];
                i = i+1;
            }else{
                vetor[k] = auxiliar[j];
                j = j-1;
            }
        }
    }
}