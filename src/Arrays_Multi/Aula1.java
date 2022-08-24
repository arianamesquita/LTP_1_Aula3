package Arrays_Multi;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Aula1 {
    public static void main(String[] args) throws InterruptedException {
/*    Random rand = new Random();
    int soma, count = 0;
        do {
            System.out.println("Rodada : " + (1 + count));
            int dado1 = rand.nextInt(1,6);
            System.out.println("Dado 1 = " + dado1);
            int dado2 = rand.nextInt(1, 6);
            System.out.println("Dado 2 = " + dado2);
            soma = dado1 + dado2;
            count++;
            System.out.println("Dado 1 = " + dado1 + " | Dado 2 = " + dado2 + " | Soma = " + soma);
            System.out.println("-----------------------");
            if (soma == 7) {
                break;
            }
            TimeUnit.SECONDS.sleep(2);
        } while (true);
        System.out.println("Quantidades de partidas jogadas antes da soma dar 7: " + count++);*/
/*        int[][] sudoku = new int[9][9];
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                System.out.println(i + " e " + j);
            }
        }*/
/*        String[][] notas = new String[25][1];
        for (int i = 0; i < 25; i++){
            for (int j = 0; j < 1; j++){
                notas[i][j] = "a";
            }
        }
        System.out.println(Arrays.deepToString(notas));*/
/*        Random rd = new Random(); //soma linha
        int[][] rand = new int[3][10];
        int[] soma = new int[3];

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 10; j++){
                rand[i][j] = rd.nextInt(1,10);
                soma[i] += rand[i][j];
                System.out.print("\t" + rand[i][j] + " ");
            }
            System.out.println(" = " + soma[i]);
        }
        System.out.println("---------------------------------------------------");*/
/*        //soma colunas
        int[][] soma = new int[1][10];
        for (int i = 0; i < 1; i++){
            for (int j = 0; j < 10; j++){
                soma[i][j] = rand[i][j] + rand[i+1][j];
                soma[i][j] = soma[i][j] + rand[i+2][j];
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("  " + rand[i][j] + " ");
            }
            System.out.println(" + " + "  ");
        }
        System.out.println("_________________________________________");
        System.out.println(Arrays.deepToString(soma));*/
/*        String[][] jogoVelha = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j){
                    jogoVelha[i][j] = "O";
                    jogoVelha[1][1] = "X";
                    jogoVelha[0][2] = "O";
                    jogoVelha[2][0] = "X";
                }else {
                    jogoVelha[i][j] = " ";
                }
            }
        }
        System.out.println("\n------------------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("| " + jogoVelha[i][j] + "  |");
            }
            System.out.println("\n------------------");
        }*/
/*        String[][] padrao = new String[3][3];
        Random rd = new Random();
        int[][] jogoVelha = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                jogoVelha[i][j] = rd.nextInt(0, 3);
                if (jogoVelha[i][j] == 0) {
                    padrao[i][j] = "O";
                } else if (jogoVelha[i][j] == 1) {
                    padrao[i][j] = "X";
                } else {
                    padrao[i][j] = " ";
                }
            }
        }*/
/*        int[][] jogoVelha = new int[3][3];
        int[] soma = new int[3];
        Scanner scan = new Scanner(System.in);
        int linha, coluna, jogador3, count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                jogoVelha[i][j] = 0;
            }
        }
        do {
            System.out.println("Rodada " + (1 + count));
            System.out.println("Entre com a linha desejada: ");
            linha = scan.nextInt();
            System.out.println("Entre com a coluna desejada: ");
            coluna = scan.nextInt();
            System.out.println("Qual jogador você é? ");
            jogador3 = scan.nextInt();

            int jogador1 = 1, jogador2 = 2;
            if (jogador3 == 1 && jogoVelha[linha][coluna] == 0 ) {
                jogoVelha[linha][coluna] = jogador1;
            } if (jogador3 == 2 && jogoVelha[linha][coluna] == 0) {
                jogoVelha[linha][coluna] = jogador2;
            } else if (jogoVelha[linha][coluna] != 0) {
                System.out.println("Essa casa já está ocupada! Tente novamente!");
            }
            System.out.println("------------------");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("| " + jogoVelha[i][j] + "  |");
                    soma[i] += jogoVelha[i][j];
                }
                System.out.println("\n------------------");

                if (soma[i] == 3){
                    System.out.println("Parabéns jogador 1! Você ganhou!");
                    break;
                } if (soma[i] == 6) {
                    System.out.println("Parabéns jogador 2! Você ganhou!");
                    break;
                }
            }
            count++;
        } while (true);*/
        // matriz identidade 5 X 5 -> diagonal igual a 1 e demais iguais a 0
/*        int[][] matrizId = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrizId[i][j] = 0;
                if (i == j){
                    matrizId[i][j] = 1;
                }
                System.out.print(" " + matrizId[i][j] + " ");
            }
            System.out.print("\n");
        }*/
        // escreva duas matrizes 3x3 -> preencher numeros aleatórios -> imprimir matrizes e resultado da soma
/*        Random rand = new Random();
        int[][] matriz1 = new int[3][3];
        int[][] matriz2 = new int[3][3];
        int soma1 = 0, soma2 = 0;
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                matriz1[i][j] = rand.nextInt(1, 10);
                soma1 += matriz1[i][j];
                matriz2[i][j] = rand.nextInt(1, 10);
                soma2 += matriz2[i][j];
            }
        }
        System.out.print(Arrays.deepToString(matriz1));
        System.out.println(" soma = " + soma1 + " ");
        System.out.print(Arrays.deepToString(matriz2));
        System.out.println(" soma = " + soma2 + " ");
        System.out.println("Soma total = " + (soma1 + soma2));*/
    }
}