package Aula;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Questao6Class {
    public static void main(String[] args) throws InterruptedException {
        Scanner ler = new Scanner(System.in);
        // armazenar 10 número aleatório no vetor - opção Random ou Math
        // enquanto atribui diga que número é esse
        // mostrar um menu para o usuário escolher
        // sair do programa //system.exit();
        int[] e = new int[10];
        Random rd = new Random();
        int i;

        System.out.println("Os números selecionados para esta rodada foram: ");
        for (i = 0; i < 10; i++){
            e[i] = rd.nextInt(-20,20);
        }
        System.out.println(Arrays.toString(e));
        while (true){
            System.out.println("\n1 - Quantidade de números pares.");//quantidade pares e ímpares
            System.out.println("2 - Quantidade de números ímpares.");
            System.out.println("3 - Quantidade de números primos.");//Quantidade números primos
            System.out.println("4 - Quantidade de números positivos.");//Quantidade números positivos e negativos
            System.out.println("5 - Quantidade de números negativos.");
            System.out.println("6 - Múltiplos de número a ser escolhido pelo usuário.");//Múltiplos de nº escolhido pelo usuário
            System.out.println("7 - O maior e o menor valor presentes no vetor.");//Maior e menor valor presente no vetor
            System.out.println("8 - A quantidade de números duplicados no vetor, quais e quantos eles são.");//Duplicados - quantos e quais são
            System.out.println("9 - Para sair do programa.");//Sair do programa

            System.out.println("\nDigite a opção desejada: ");
            int resposta = ler.nextInt();

            switch (resposta) {
                case 1: //qttd pares e impares
                    int a = qtddPares(e);
                    System.out.println("A quantidade de números pares é: " + a);
                    break;
                case 2: //qttd pares e impares
                    int b = qtddImpares(e);
                    System.out.println("A quantidade de números ímpares é: " + b);
                    break;
                case 3: //verifica primo
                    int c = qtddPrimo(e);
                    System.out.println("A quantidade de números primos é: " + c);
                    break;
                case 4: //verifica positivo
                    int d = qtddPositivos(e);
                    System.out.println("A quantidade de números positivos é: " + d);
                    break;
                case 5: //verifica negativo
                    int f = qtddNegativos(e);
                    System.out.println("A quantidade de números primos é: " + f);
                    break;
                case 6: //qtdd múltiplos de um número escolhido pelo usuário
                    qtddMultiplos(e);
                    break;
                case 7: //maior e menor número
                    maiorEmenor(e);
                    break;
                case 8: //duplicados
                    duplicados(e);
                    break;
                case 9:
                    System.exit(0);
            }
            TimeUnit.SECONDS.sleep(5); //esperar um segundo para a próxima impressão.
        }
    }

    public static int qtddPares(int[] x){ // chama o int[] e para ele rodar dentro da class
        int j;
        int count1 = 0;
        for (j = 0; j < x.length; j++){
            if (x[j] % 2 == 0 && x[j] != 0){
                count1++;
            }
        }
        return count1;
    }
    public static int qtddImpares(int[] x) {
        int j;
        int count2 = 0;
        for (j = 0; j < x.length; j++) {
            if (!(x[j] % 2 == 0 && x[j] != 0)) {
                count2++;
            }
        }
        return count2;
    }
    public static int qtddPrimo(int[] x) {
        int count3 = 0;
        int i;
        for (i = 0; i < x.length; i++){
            if (!(x[i] % 2 == 0) && (!(x[i] % 3 == 0)) || x[i] == 2 || x[i] == -2 || x[i] == -3 || x[i] == 3){
                count3++;
            }
        }
        return count3;
    }
    public static int qtddPositivos(int[] x) {
        int i;
        int countP = 0;
        for (i = 0; i < 10; i++) {
            if (x[i] > 0) {
                countP++;
            }
        }
        return countP;
    }
    public static int qtddNegativos(int[] x) {
        int i;
        int countN = 0;
        for (i = 0; i < 10; i++) {
            if (x[i] < 0) {
                countN++;
            }
        }
        return countN;
    }
    public static int[] qtddMultiplos(int[] x) {
        Scanner ler = new Scanner(System.in);
        int num, i;
        System.out.println("Escolha um número que esteja entre os informados acima:");
        num = ler.nextInt();
        int[] f1 = new int[10];
        if (num != 0){
            if (num < 0) {
                f1 = new int[-(num)];
                for (i = 0; i < f1.length; i++) {
                    f1[i] = num + i;
                }
                System.out.println("Os números múltiplos de " + num + " são: ");
                for (i = 0; i >= num; i++) {
                    if (num % f1[i] == 0) {
                        System.out.println(f1[i]);
                    }
                    if (f1[i] == -1) {
                        break;
                    }
                }
            }
            else if (num > 0) {
                f1 = new int[(num)];
                for (i = 0; i < num; i++) {
                    f1[i] = i + 1;
                }
                System.out.println("Os números múltiplos de " + num + " são: ");
                for (i = 0; i < num; i++) {
                    if (num % f1[i] == 0) {
                        System.out.println(f1[i]);
                    }
                }
            }
        }
        return f1;
    }
    public static int[] maiorEmenor(int[] x) {
        int maior = x[0], menor = x[0];
        int i;
        for (i = 1; i < x.length; i++){
            if (x[i] > maior){
                maior = x[i];
            }
            if (x[i] < menor){
                menor = x[i];
            }
        }
        System.out.println("O maior valor é: " + maior + " e o menor valor é: " + menor + ".");
        return x;
    }
    public static int[] duplicados(int[] x) {
        int[] fr = new int[20];
        int visto = -1, i, j;
        for (i = 0; i < x.length; i++){
            int countNum = 0;
            for(j = i+1; j < x.length; j++){
                if (x[i] == x[j]){
                    countNum++;
                    fr[j] = visto; // se já leu, não lê de novo.
                }
            } if (fr[i] != visto){ // se aparece com número diferente de -1, é impresso
                fr[i] = countNum;
            }
        }
        System.out.println("---------------------------------");
        System.out.println("\tNúmero    ||\tQtdd vezes");
        System.out.println("---------------------------------");
        for (i = 0; i < x.length; i++){
            if (fr[i] > 0){
                System.out.println("\t" + x[i] + "\t\t   |\t   " + (fr[i]+1));
            }
        }
        System.out.println("---------------------------------");
        return x;
    }
}
