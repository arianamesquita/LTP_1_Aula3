package Aula;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Questao6Unificada {
    public static void main(String[] args) {
        int[] e = new int[10];
        Random rd = new Random();
        int i;
        System.out.println("Os n�meros selecionados para esta rodada foram: ");
        for (i = 0; i < 10; i++){
            e[i] = rd.nextInt(-20,20);
        }
        System.out.println(Arrays.toString(e));
        // pares e �mpares
        System.out.println("\nQuantidade de n�meros pares e �mpares no vetor.");
        int j;
        int count1 = 0;
        int count2 = 0;
        for (j = 0; j < e.length; j++){
            if (e[j] % 2 == 0){
                count1++;
            }
            if (!(e[j] % 2 == 0)){
                count2++;
            }
        }
        System.out.println("A quantidade de n�meros pares � de: " + count1);
        System.out.println("A quantidade de n�meros �mpares � de: " + count2);

        //Quantidade n�meros primos
        System.out.println("\nQuantidade de n�meros primos no vetor.");
        int count = 0;
        for (i = 0; i < e.length; i++){
            if (!(e[i] % 2 == 0) && (!(e[i] % 3 == 0)) || e[i] == 2 || e[i] == -2 || e[i] == 3 || e[i] == -3 ){
                count++;
            }
        }
        System.out.println("A quantidade de n�meros primos � de: " + count);

        //Quantidade n�meros positivos e negativos
        System.out.println("\nQuantidade de n�meros positivos e negativos no vetor.");
        int countP = 0;
        int countN = 0;

        for (i = 0; i < 10; i++) {
            if (e[i] > 0) {
                countP++;
            }
            if (e[i] < 0) {
                countN++;
            }
        }
        System.out.println("A quantidade de n�meros positivos � de: " + countP);
        System.out.println("A quantidade de n�meros negativos � de: " + countN);

        //Quantidade de n�meros m�ltiplos de um determinado n�mero escolhido pelo usu�rio
        System.out.println("\nQuantidade de m�ltiplos de um n�mero do vetor a ser escolhido pelo usu�rio.");
        Scanner ler = new Scanner(System.in);
        int num;
        System.out.println("Escolha um n�mero que esteja entre os informados acima:");
        num = ler.nextInt();
        if (num <= 0){
            int[] f = new int[-(num)];
            for (i = 0; i < f.length; i++){
                f[i] = num + i;
            }
            System.out.println(Arrays.toString(f));
            System.out.println("Os n�meros m�ltiplos de " + num + " s�o: ");
            for (i = 0; i >= num; i++){
                if (num % f[i] == 0){
                    System.out.println(f[i]);
                }
                if (f[i] == -1){
                    break;
                }
            }
        }
        if (num > 0){
            int[] f = new int[num];
            for (i = 0; i < num ; i++){
                f[i] = i + 1;
            }
            System.out.println("Os n�meros m�ltiplos de " + num + " s�o: ");
            for (i = 0; i < num; i++){
                if (num % f[i] == 0){
                    System.out.println(f[i]);
                }
            }
        }

        //O maior e menor valor presente no vetor
        System.out.println("\nQual o maior e o menor valor presentes no vetor?");
        int maior = e[0], menor = e[0];
        for (i = 1; i < e.length; i++){
            if (e[i] > maior){
                maior = e[i];
            }
            if (e[i] < menor){
                menor = e[i];
            }
        }
        System.out.println("O maior valor �: " + maior + " e o menor valor �: " + menor + ".");

        //Se existem duplicados, quais s�o e quantas c�pias de cada
        System.out.println("\nA quantidade de n�meros duplicados e quais s�o eles?");
        int[] fr = new int[20];
        int visto = -1;
        for (i = 0; i < e.length; i++){
            int countNum = 0;
            for(j = i+1; j < e.length; j++){
                if (e[i] == e[j]){
                    countNum++;
                    fr[j] = visto; // se j� leu, n�o l� de novo.
                }
            } if (fr[i] != visto){ // se aparece com n�mero diferente de -1, � impresso
                fr[i] = countNum;
            }
        }
        System.out.println(Arrays.toString(fr));
        System.out.println("---------------------------------");
        System.out.println("\tN�mero    ||\tQtdd vezes");
        System.out.println("---------------------------------");
        for (i = 0; i < e.length; i++){
            if (fr[i] > 0){
                System.out.println("\t" + e[i] + "\t\t   |\t   " + (fr[i]+1));
            }
        }
        System.out.println("---------------------------------");
    }
}

