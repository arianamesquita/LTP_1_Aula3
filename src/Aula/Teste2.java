package Aula;

import java.util.Arrays;
import java.util.Scanner;

public class Teste2 {
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
        int[] fr = {0,0,0,0,0,0,0,0,0,0};
        int i;
        int media = 0;

        System.out.println("Entre o valor da nota entre 1 a 10: ");
        for (i = 0; i < coxinha.length; i++) {
            coxinha[i] = ler.nextInt();
            while (coxinha[i] > 10 || coxinha[i] <= 0) {
                System.out.println("Entre um valor válido!");
                coxinha[i] = ler.nextInt();
            }
            media += coxinha[i];
            ++fr[(coxinha[i] - 1)];
        }


        System.out.println("\n A soma total dos votos foi de: " + media);
        Arrays.sort(coxinha);
        System.out.println("\n A média da avaliação dos usuários foi de: " + (media /= coxinha.length));
        System.out.println("-------------------------------");
        System.out.println("|  Avaliação    |    Frequência  |");
        for (i = 0; i < 10; i++){
            System.out.println("|\t\t" + (i+1) + "\t\t| \t\t" + fr[i] + "\t\t|");
        }

    }
}