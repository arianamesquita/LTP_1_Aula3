package Aula;

import java.util.Arrays;
import java.util.Random;

public class ListaTeste {
    public static void main(String[] args) {

/*        int[] b = new int[10];
        int i;
        for(i =0; i <= 9; i++) // Não pode ser 10 ou b.length, só funciona com 9.
        {
            b[i] = 1;
        }
        System.out.println(Arrays.toString(b));*/
/*        int [] a = {1,1,1,1,1,1,1,1,1,1,1};
        int [] b = new int[34];
        Random rd = new Random();
        int i;
        for (i = 0; i < a.length; i++){
            b[i] = a[i];
            System.out.println(Arrays.toString(b));
        }
        System.out.println("Os números selecionados para esta rodada foram: ");
        for (i = 11; i < b.length; i++){
            b[i] = rd.nextInt(2,10);
        }
        System.out.println(Arrays.toString(b));*/
/*        float[] c = {8.2f, 5.3f, 2.5f, 9.9f, 5.6f, 7.7f, 7.3f, 6.9f, 4.1f};
//        Arrays.sort(c);
//        System.out.println("O menor valor: " + c[0]);
//        System.out.println("O maior valor: " + c[8]);
        float maior = c[0], menor = c[0];
        for (int i = 1; i < 9; i++){
            if (c[i] > maior){
                maior = c[i];
            }
            if (c[i] < menor){
                menor = c[i];
            }
        }
        System.out.println("O maior valor é: " + maior + " e o menor valor é: " + menor + ".");*/
/*        int[] marks = {35,65,95};
        System.out.print(marks.length + "," + marks[1]);*/
/*        int[] balls = {};
        System.out.println(balls.length);*/
/*        int[] d = {1,2,3,4,5,6,7,8,9,10};
        int i;
        for (i = 0; i < d.length; i++){
            if (!(d[i] % 2 == 0) || d[i] == 2) {
                System.out.println("Este número é primo:  " + d[i]);
            }
        }*/
 /*       int[] e = new int[10];
        Random rd = new Random();
        int i = 0;
        int countP = 0;
        int countN = 0;

        System.out.println("Os números selecionados para esta rodada foram: ");
        for (i = 0; i < 10; i++){
            e[i] = rd.nextInt(-20,20);
        }
        System.out.print(Arrays.toString(e));
        for (i = 0; i < 10; i++) {
            if (e[i] > 0) {
                countP++;
            }
            if (e[i] < 0) {
                countN++;
            }
        }
        System.out.println("\nA quantidade de números positivos é de: " + countP);
        System.out.println("A quantidade de números negativos é de: " + countN);*/
/*        // pares e ímpares
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
        System.out.println("A quantidade de números pares é de: " + count1);
        System.out.println("A quantidade de números ímpares é de: " + count2);*/
/*        // Quantidade de números primos
        int[] e = new int[10];
        Random rd = new Random();
        System.out.println("Os números selecionados para esta rodada foram: ");
        for (int i = 0; i < 10; i++){
            e[i] = rd.nextInt(-20,20);
        }
        System.out.println(Arrays.toString(e));
        int i;
        int count = 0;
        for (i = 0; i < e.length; i++){
            if (!(e[i] % 2 == 0) && (!(e[i] % 3 == 0)) || e[i] == 2 || e[i] == -2 || e[i] == 3 || e[i] == -3 ){
                count++;
                System.out.println("Os números primos são: " + e[i]);
            }
        }
        System.out.println("A quantidade de números primos é de: " + count);*/
/*        int[] e = new int[10];
        int i;
        Random rd = new Random();
        System.out.println("Os números selecionados para esta rodada foram: ");
        for (i = 0; i < 10; i++){
            e[i] = rd.nextInt(-20,20);
        }
        System.out.println(Arrays.toString(e));
        Scanner ler = new Scanner(System.in);
        int num;
        System.out.println("Escolha um número que esteja entre os informados acima:");
        num = ler.nextInt();
        if (num < 0){
            int[] f = new int[-(num)];
            for (i = 0; i < f.length; i++){
                f[i] = num + i;
            }
            System.out.println(Arrays.toString(f));
            System.out.println("Os números múltiplos de " + num + " são: ");
            for (i = 0; i > num; i++){
                if (num % f[i] == 0){
                    System.out.println(f[i]);
                }
            }
        }
        if (num > 0){
            int[] f = new int[num];
            for (i = 0; i < num ; i++){
                f[i] = i + 1;
            }
            System.out.println("Os números múltiplos de " + num + " são: ");
            for (i = 0; i < num; i++){
                if (num % f[i] == 0){
                    System.out.println(f[i]);
                }
            }
        }*/
/*        int[] e = new int[10];
        int maior = e[1], menor = e[0];
        int i;
        Random rd = new Random();
        System.out.println("Os números selecionados para esta rodada foram: ");
        for (i = 0; i < 10; i++){
            e[i] = rd.nextInt(0,20);
            System.out.println(e[i]);
        }
        for (i = 0; i < e.length; i++){
            if (e[i] > maior){
                maior = e[i];
            }
            if (e[i] < menor){
                menor = e[i];
            }
        }
        System.out.println("O maior valor é: " + maior + " e o menor valor é: " + menor + ".");*/
/*        int[] e = new int[10];
        int i;
        int[] igual = new int[21];
        Random rd = new Random();
        System.out.println("Os números selecionados para esta rodada foram: ");
        for (i = 0; i < 10; i++){
            e[i] = rd.nextInt(0,20);
        }
        System.out.println(Arrays.toString(e));
        for (i = 0; i < e.length; i++){
            ++igual[(e[i])];
        }
        System.out.println("\n" + "\tNºs Repetidos   |   " + "Qtdd vezes");
        for (i = 0; i < igual.length; i++){
            if (igual[i] > 1){
                System.out.println("\t\t" + i + "\t\t\t|\t\t" + igual[i]);
            }
        }*/
/*        String[] vetor1 = {"maçã", "banana", "uva", "pêra","laranja"};
        String[] vetor2 = {"abacate", "manga", "banana", "laranja","mexerica"};
        int i, j;

        for (i = 0; i < 5; i++){
            for(j = 0; j < 5; j++){
                if (vetor1[i].equals(vetor2[j])){
                    System.out.println(vetor1[i]);
                }
            }
        }*/
/*        int[] num1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] num2 = {20, 25, 35, 5, 7, 60, 8, 15};
        int i, j;
        System.out.println("Os seguintes números se encontram nos dois arrays: ");
        for(i = 0; i < num1.length; i++){
            for (j = 0; j < num2.length; j++){
                if (num2[j] == num1[i]){
                    System.out.println(num2[j]);
                }
            }
        }*/
/*        int[] c = new int[10];
        Random rd = new Random();
        int i;
        for (i = 0; i < c.length; i++){
            c[i] = rd.nextInt(0,10);
        }
        System.out.println(Arrays.toString(c)); //aqui imprime em linha o array selecionado no random acima.
        int menor1 = [0];
        int menor2 = [1];
        for (i = 0; i < 10; i++){
            if (c[i] < menor1){
                menor2 = menor1;
                menor1 = c[i];
            } else if (c[i] < menor2 && c[i] > menor1) {
                menor2 = c[i];
            }
        }
        System.out.println("O menor número é: " + menor1);
        System.out.println("O segundo menor número é: " + menor2);*/
/*        int[] z = {42, 55, 95, 79, 85};
        int i, countC = 0, countD = 0;
        for (i = 0; i < 4; i++){
            if (z[i] > z[i+1]){
                countC++;
            } else if (z[i] < z[i+1]){
                countD++;
            }
        }
        if (countC == 4){
            System.out.println("O vetor está ordenado de forma decrescente!");
        } else if (countD == 4){
            System.out.println("O vetor está ordenado de forma crescente!");
        } else {
            System.out.println("O vetor está desordenado!");
        }*/
        int[] z = {86, 75, 63, 54, 42, 38, 29, 11, 8};

/*        if (z[0] < z[1] && z[1] < z[2] && z[2] < z[3] && z[3] < z[4] && z[4] < z[5]){
            System.out.println("O vetor está ordenado de forma crescente!");
        }
        else if (z[0] > z[1] && z[1] > z[2] && z[2] > z[3] && z[3] > z[4] && z[4] > z[5]){
            System.out.println("O vetor está ordenado de forma decrescente!");
        }
        else {
            System.out.println("O vetor está desordenado!");
        }*/
        //ou também
/*        int j = 1, count = 0, count2 = 0;
        for (int i = 0; i <= z.length; i++){
            if (z[i] < z[i+j]){
                count++;
            }
            if (z[i] > z[i+j]){
                count2++;
            }
        }
        if (count < z.length){
            System.out.println("O vetor está desordenado!");
        }
        else if (count == z.length){
            System.out.println("O vetor está ordenado de forma crescente!");
        }
        else if (count2 < z.length){
            System.out.println("O vetor está desordenado!");
        } else if (count2 == z.length) {
            System.out.println("O vetor está ordenado de forma decrescente!");
        }*/

/*        if (z[i] < z[i+j]){
            System.out.println("O vetor está ordenado de forma crescente!");
        }
        else if (z[i] > z[i+j]){
            System.out.println("O vetor está ordenado de forma decrescente!");
        }
        else{
            System.out.println("O vetor está desordenado!");
        }*/



/*        float[] c = new float[100];
        Random rd = new Random();
        int i;
        for (i = 0; i < c.length; i++){
            c[i] = rd.nextInt(0,10);
        }
        System.out.println(Arrays.toString(c));
        float soma = 0;
        for (i = 0; i < c.length; i++){
            soma += c[i];
        }
        System.out.println(soma);*/
        //como ordenar vetor de números inteiros
        int[] c = new int[10];
        Random rd = new Random();
        System.out.println("Os números selecionados para esta rodada foram: ");
        for (int i = 0; i < 10; i++){
            c[i] = rd.nextInt(0,20);
        }
        System.out.println(Arrays.toString(c));

        Arrays.sort(c);
        System.out.println(Arrays.toString(c));

        //Bubble sort, quick sort, merge sort
        int i, j, aux;
        for (i = 0; i < 10; i++){
            for (j = 1; j < (10 - i); j++){
                if (c[j-1] > c[j]){
                    aux = c[j-1];
                    c[j-1] = c[j];
                    c[j] = aux;
                }
            }
        }
        System.out.println(Arrays.toString(c));

/*        int[] x = new int[10];
        Random rd = new Random();
        int i;
        for (i = 0; i < x.length; i++){
            x[i] = rd.nextInt(0,10);
        }
        System.out.println(Arrays.toString(x)); //aqui imprime em linha o array selecionado no random acima.
        int menor1 = x[1];
        int menor2 = x[0];
        for (i = 2; i < 10; i++){
            if (x[i] < menor2) {
                if (x[i] < menor1) {
                    menor2 = menor1;
                    menor1 = x[i];
                } else if (x[i] < menor2 && x[i] > menor1) {
                    menor2 = x[i];
                }
            }
        }
        System.out.println("O menor número é: " + menor1 + " e o segundo menor é: " + menor2);*/

/*        int[] c = new int[10];
        Random rd = new Random();
        int i;
        for (i = 0; i < c.length; i++){
            c[i] = rd.nextInt(0,10);
        }
        System.out.println(Arrays.toString(c));
        int menor1 = Integer.MAX_VALUE;
        int menor2 = Integer.MAX_VALUE;

        for (i = 0; i < c.length; i++){
            if (c[i] < menor1){
                menor2 = menor1;
                menor1 = c[i];
            } else if (c[i] < menor2 && c[i] > menor1) {
                menor2 = c[i];
            }
        }
        System.out.println("O menor número é: " + menor1);
        System.out.println("O segundo menor número é: " + menor2);*/

    }
}
