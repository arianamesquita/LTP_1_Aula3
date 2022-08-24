package Aula;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Questao6Class {
    public static void main(String[] args) throws InterruptedException {
        Scanner ler = new Scanner(System.in);
        // armazenar 10 n�mero aleat�rio no vetor - op��o Random ou Math
        // enquanto atribui diga que n�mero � esse
        // mostrar um menu para o usu�rio escolher
        // sair do programa //system.exit();
        int[] e = new int[10];
        Random rd = new Random();
        int i;

        System.out.println("Os n�meros selecionados para esta rodada foram: ");
        for (i = 0; i < 10; i++){
            e[i] = rd.nextInt(-20,20);
        }
        System.out.println(Arrays.toString(e));
        while (true){
            System.out.println("\n1 - Quantidade de n�meros pares.");//quantidade pares e �mpares
            System.out.println("2 - Quantidade de n�meros �mpares.");
            System.out.println("3 - Quantidade de n�meros primos.");//Quantidade n�meros primos
            System.out.println("4 - Quantidade de n�meros positivos.");//Quantidade n�meros positivos e negativos
            System.out.println("5 - Quantidade de n�meros negativos.");
            System.out.println("6 - M�ltiplos de n�mero a ser escolhido pelo usu�rio.");//M�ltiplos de n� escolhido pelo usu�rio
            System.out.println("7 - O maior e o menor valor presentes no vetor.");//Maior e menor valor presente no vetor
            System.out.println("8 - A quantidade de n�meros duplicados no vetor, quais e quantos eles s�o.");//Duplicados - quantos e quais s�o
            System.out.println("9 - Para sair do programa.");//Sair do programa

            System.out.println("\nDigite a op��o desejada: ");
            int resposta = ler.nextInt();

            switch (resposta) {
                case 1: //qttd pares e impares
                    int a = qtddPares(e);
                    System.out.println("A quantidade de n�meros pares �: " + a);
                    break;
                case 2: //qttd pares e impares
                    int b = qtddImpares(e);
                    System.out.println("A quantidade de n�meros �mpares �: " + b);
                    break;
                case 3: //verifica primo
                    int c = qtddPrimo(e);
                    System.out.println("A quantidade de n�meros primos �: " + c);
                    break;
                case 4: //verifica positivo
                    int d = qtddPositivos(e);
                    System.out.println("A quantidade de n�meros positivos �: " + d);
                    break;
                case 5: //verifica negativo
                    int f = qtddNegativos(e);
                    System.out.println("A quantidade de n�meros primos �: " + f);
                    break;
                case 6: //qtdd m�ltiplos de um n�mero escolhido pelo usu�rio
                    qtddMultiplos(e);
                    break;
                case 7: //maior e menor n�mero
                    maiorEmenor(e);
                    break;
                case 8: //duplicados
                    duplicados(e);
                    break;
                case 9:
                    System.exit(0);
            }
            TimeUnit.SECONDS.sleep(5); //esperar um segundo para a pr�xima impress�o.
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
        System.out.println("Escolha um n�mero que esteja entre os informados acima:");
        num = ler.nextInt();
        int[] f1 = new int[10];
        if (num != 0){
            if (num < 0) {
                f1 = new int[-(num)];
                for (i = 0; i < f1.length; i++) {
                    f1[i] = num + i;
                }
                System.out.println("Os n�meros m�ltiplos de " + num + " s�o: ");
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
                System.out.println("Os n�meros m�ltiplos de " + num + " s�o: ");
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
        System.out.println("O maior valor �: " + maior + " e o menor valor �: " + menor + ".");
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
                    fr[j] = visto; // se j� leu, n�o l� de novo.
                }
            } if (fr[i] != visto){ // se aparece com n�mero diferente de -1, � impresso
                fr[i] = countNum;
            }
        }
        System.out.println("---------------------------------");
        System.out.println("\tN�mero    ||\tQtdd vezes");
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
