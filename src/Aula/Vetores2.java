package Aula;

import java.util.Arrays;
import java.util.Scanner;

public class Vetores2 {
    public static void main(String[] args) {
        // Declara��o
        // s� armazena o msm tipo. string, int, double.
        // o que "guardar" em um vetor?
        Scanner ler = new Scanner(System.in);

/*
        int[] vetor01; //falo que eu quero um vetor de nome 'vetor01'

        System.out.println("Digite o tamanho desejado do vetor: ");
        int tamanho = ler.nextInt();
        vetor01 = new int[tamanho];

*//*        vetor01[0] = 10;*//*

        System.out.println("O tamanho do vetor �: " + vetor01.length);*/

/*         Guardar em vetor notas dadas ao produto coxinha. Devem ser 30 notas de 1 a 10.
         Depois o sistema deve calular a m�dia e a quantidade de pessoas em cada faixa de valor.
         usar vetor auxiliar pra contar frequ�ncia*/

        int[] coxinha = new int[30];
        int[] fr = new int[coxinha.length];
        int visto = -1;
        int i, j, count;
        float media = 0;
        count = 1;

        System.out.println("Entre o valor da nota entre 1 a 10: ");
        for (i = 0; i < coxinha.length; i++) {
            coxinha[i] = ler.nextInt();
            while (coxinha[i] > 10 || coxinha[i] < 0) {
                System.out.println("Entre um valor v�lido!");
                coxinha[i] = ler.nextInt();
            } media += coxinha[i];
        }
        System.out.println("\n A soma total dos votos foi de: " + media);
        Arrays.sort(coxinha);
        System.out.println("\n A m�dia da avalia��o dos usu�rios foi de: " + (media/= coxinha.length));

        for (i = 0; i < coxinha.length; i++){
            count = 1;
            for(j = i+1; j < coxinha.length; j++){
                if (coxinha[i] == coxinha[j]){
                    count++;
                    fr[j] = visto; // se j� leu, n�o l� de novo.
                }
            } if (fr[i] != visto){ // se aparece com n�mero diferente de -1, � impresso
                fr[i] = count;
            }
        }

        System.out.println("\n As avalia��es tiveram as seguintes notas e na frente deles est� a quantidade de votos.");
        System.out.println("------------------");
        System.out.println("Nota    ||  Qtdd Votos");
        System.out.println("------------------");
        for (i = 0; i < fr.length; i++){
            if (fr[i] != visto){
                System.out.println("   " + coxinha[i] + "     |     " + fr[i]);
            }
        }
        System.out.println("------------------");
    }
}
