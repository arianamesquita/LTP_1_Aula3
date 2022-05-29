package Aula;

import java.util.Arrays;
import java.util.Scanner;

public class Vetores2 {
    public static void main(String[] args) {
        // Declaração
        // só armazena o msm tipo. string, int, double.
        // o que "guardar" em um vetor?
        Scanner ler = new Scanner(System.in);

/*
        int[] vetor01; //falo que eu quero um vetor de nome 'vetor01'

        System.out.println("Digite o tamanho desejado do vetor: ");
        int tamanho = ler.nextInt();
        vetor01 = new int[tamanho];

*//*        vetor01[0] = 10;*//*

        System.out.println("O tamanho do vetor é: " + vetor01.length);*/

        // Guardar em vetor notas dadas ao produto coxinha. Devem ser 30 notas de 1 a 10.
        // Depois o sistema deve calular a média e a quantidade de pessoas em cada faixa de valor.
        // usar vetor auxiliar pra contar frequência

        int[] coxinha = new int[30];
        int[] fr = new int[coxinha.length];
        int visto = -1;
        int i;
        int j;
        int count;
        float media = 0;

        System.out.println("Entre o valor da nota entre 1 a 10: ");
        for (i = 0; i < coxinha.length; i++) {
/*            if (ler.hasNext("[0-10]")){
                coxinha[i] = ler.nextInt();
                media += coxinha[i];
            } else {
                System.out.println("Entre um valor válido!");
                media--;
            }*/
            if (coxinha[i] > 10 || coxinha[i] < 0) {
                System.out.println("Entre um valor válido!");
                media--;
            }
            if (coxinha[i] <= 10 || coxinha[i] >= 0){
                media += coxinha[i];
            }
        }
        System.out.println("\n A soma total dos votos foi de: " + media);
        media /= coxinha.length;
        Arrays.sort(coxinha);
        System.out.println("\n A média da avaliação dos usuários foi de: " + media);
//        System.out.println("\n" + Arrays.toString(coxinha)); // Para imprimir o Array

        for (i = 0; i < coxinha.length; i++){
            count = 1;
            for(j = i+1; j < coxinha.length; j++){
                if (coxinha[i] == coxinha[j]){
                    count++;
                    fr[j] = visto; // se já leu, não lê de novo.
                }
            }
            if (fr[i] != visto){ // se aparece com número diferente de -1, é impresso
                fr[i] = count;
            }
        }
        System.out.println("\n As avaliações tiveram as seguintes notas e na frente deles está a quantidade de votos.");
        System.out.println("------------------");
        System.out.println("Nota || Qtdd Votos");
        System.out.println("------------------");
        for (i = 0; i < fr.length; i++){
            if (fr[i] != visto && fr[i]>=0 && coxinha[i]<=10){
                System.out.println("   " + coxinha[i] + "     |     " + fr[i]);
            }
        }
        System.out.println("------------------");
    }
}
