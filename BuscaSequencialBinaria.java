/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscasequencialbinaria_20791164_20885872;



/**
 * @author #Leonardo Sasounian Bongiovanni#
 *         #Lucas Pineda#
 */
public class BuscaSequencialBinaria_20791164_20885872 {
    public static void main(String[] args) {
        int[] vetorBuscaSequencial = {10, 25, 75, 85, 1, -1, 61, 80};
        int[] vetorBuscaBinariaIterativa = {1, 2, 30, 41, 73, 81, 90, 101};
        int[] vetorBuscaBinariaRecursiva = {10, 25, 35, 40, 70, 80, 95, 101};
        
        //Busca sequencial
        System.out.println("Busca Sequencial");
        int buscaSeq = (BuscaSequencial(vetorBuscaSequencial, 85));
        int buscaSeqErrado = (BuscaSequencial(vetorBuscaSequencial, 90));
        System.out.println(Define(buscaSeq));
        System.out.println(Define(buscaSeqErrado) + "\n");
        
        //Busca Binaria iterativa
        System.out.println("Busca Binaria Iterativa");
        int buscaBin = (BuscaBinariaIterativa(vetorBuscaBinariaIterativa, 30));
        int buscaBinErrado = (BuscaBinariaIterativa(vetorBuscaBinariaIterativa, 200));
        System.out.println(Define(buscaBin));
        System.out.println(Define(buscaBinErrado) + "\n");
        
        //Busca Binaria Recursiva
        System.out.println("Busca Binaria Recursiva");
        int buscBinRec = (BuscaBinariaRecursiva(vetorBuscaBinariaRecursiva, 35, 0, vetorBuscaBinariaRecursiva.length-1));
        int buscBinRecErrada = (BuscaBinariaRecursiva(vetorBuscaBinariaRecursiva, 200, 0, vetorBuscaBinariaRecursiva.length-1));
        System.out.println(Define(buscBinRec));
        System.out.println(Define(buscBinRecErrada));
        /*
            -   Implementar os 3 algoritmos contidos nos slides e utilizar os vetores acima 
                como massa de testes, hÃ¡ um vetor para cada exercÃ­cio.
            -   Fazer duas chamadas para cada mÃ©todo, uma em que encontra a posiÃ§Ã£o do elemento e
                outra em que o elemento buscado nÃ£o estÃ¡ presenta na lista.
            -   Printar a resposta de todas as chamadas aos mÃ©todos.                
        */
    }
    
    public static int BuscaSequencial(int[] vetor, int valorBuscado){
        int i;
        for (i = 0; i < vetor.length; i++) {
            if(vetor[i] == valorBuscado){
                //System.out.println("Valor encontrado na posiÃ§Ã£o: " + i);
                return i;
            }             
        }
        return -1;
    }
    
    public static int BuscaBinariaIterativa(int[] vetor, int valorBuscado){
        int esq = 0, drt = (vetor.length-1), metade;
        while(esq<=drt){
            metade = (esq+drt)/2;
            if(valorBuscado == vetor[metade]){
                return metade;
            } else{
                if(valorBuscado < vetor[metade]){
                    drt = metade - 1;
                } else{
                    if(valorBuscado > vetor[metade]){
                        esq = metade + 1;
                    }
                }
            }
        }
        return -1;
    }
    
    public static int BuscaBinariaRecursiva(int[] vetor, int valorBuscado, int esq, int dir){
        int metade;
       
        if(esq > dir){
            return -1;
        }
        metade = (esq+dir)/2;
        
        if(valorBuscado == vetor[metade]){
            return metade;
        } 
        if(valorBuscado < vetor[metade]){
                dir = metade-1;
                return BuscaBinariaRecursiva(vetor, valorBuscado, esq, dir);
            }
        if(valorBuscado > vetor[metade]){
                    esq = metade + 1;}
                    return BuscaBinariaRecursiva(vetor, valorBuscado, esq, dir);  
}
    public static String Define(int num){
        String retorno;
        if (num == -1) {
            retorno = "O valor buscado não se encontra no vetor";
        }else{
            retorno = "O valor se encontra na posição " + num;
        }    
        return retorno;
}}
