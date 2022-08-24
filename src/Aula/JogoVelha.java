package Aula;

import java.util.Objects;
import java.util.Scanner;

public class JogoVelha {
    public static void main(String[] args) throws InterruptedException {
        String[][] jogoVelha = new String[3][3]; // 99 sem class e 106 com ele
        Scanner scan = new Scanner(System.in);
        int linha, coluna, count = 0, stop = 0, count1, count2;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                jogoVelha[i][j] = " ";
            }
        }
        while (stop == 0) {
            for (int i = 0; i < 2; i++){
                desenhaTabuleiro(jogoVelha);
                System.out.println("Rodada " + (1 + count));
                count++;
                System.out.println("Entre com a linha desejada: ");
                linha = scan.nextInt();
                System.out.println("Entre com a coluna desejada: ");
                coluna = scan.nextInt();
                String jogador1 = "O", jogador2 = "X";
                if (!Objects.equals(jogoVelha[linha][coluna], " ")){
                    System.out.println("Tente novamente!");
                }
                if (Objects.equals(jogoVelha[linha][coluna], " ")){
                    if (i == 0){
                        jogoVelha[linha][coluna] = jogador1;
                    }
                    if (i == 1){
                        jogoVelha[linha][coluna] = jogador2;
                    }
                }
                int f = verificaLinha(jogoVelha);
                if (f > 0){
                    stop++;
                }
                int g = verificaColuna(jogoVelha);
                if (g > 0){
                    stop++;
                }
                int h = verificaTransversais(jogoVelha);
                if (h > 0){
                    stop++;
                }
            }
        }
    }
    public static void desenhaTabuleiro (String[][]n){
        System.out.println("\n------------------");
        for (int o = 0; o < 3; o++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("| " + n[o][j] + "  |");
            }
            System.out.println("\n------------------");
        }
    }
    public static int verificaLinha(String[][] x){
        int stop = 0;
        for (int a = 0; a < 3; a++){
            int count1 = 0, count2 = 0;
            for (int b = 0; b < 3; b++) {
                if (x[a][b].equals("X")) {
                    count1++;
                    if (count1 == 3) {
                        System.out.println("Parabéns Jogador 1! Você venceu!");
                        stop++;
                    }
                } else if (x[a][b].equals("O")) {
                    count2++;
                    if (count2 == 3) {
                        System.out.println("Parabéns Jogador 2! Você venceu!");
                        stop++;
                    }
                }
            }
        } return stop;
    }
    public static int verificaColuna(String[][] x){ //comparar uma casa com a outra e diferente de espaço - funciona
        int stop = 0;
        for (int c = 0; c < 1; c++){
            for (int d = 0; d < 3; d++){
                if (x[c][d].equals("X") && x[c + 1][d].equals("X") && x[c + 2][d].equals("X")) {
                    System.out.println("Parabéns Jogador 1! Você venceu!");
                    stop++;
                } else if (x[c][d].equals("O") && x[c + 1][d].equals("O") && x[c + 2][d].equals("O")) {
                    System.out.println("Parabéns Jogador 2! Você venceu!");
                    stop++;
                }
            }
        } return stop;
    }
    public static int verificaTransversais(String[][] x){
        int stop = 0;
        for (int c = 0; c < 1; c++) {
            for (int d = 0; d < 1; d++) {
                if (x[c][d].equals("O") && x[c + 1][d + 1].equals("O") && x[c + 2][d + 2].equals("O")) {
                    System.out.println("Parabéns Jogador 2! Você venceu!");
                    stop++;
                } else if (x[c][d].equals("X") && x[c + 1][d + 1].equals("X") && x[c + 2][d + 2].equals("X")) {
                    System.out.println("Parabéns Jogador 1! Você venceu!");
                    stop++;
                }if (x[c][d + 2].equals("O") && x[c + 1][d + 1].equals("O") && x[c + 2][d].equals("O")) {
                    System.out.println("Parabéns Jogador 2! Você venceu!");
                    stop++;
                } else if (x[c][d + 2].equals("X") && x[c + 1][d + 1].equals("X") && x[c + 2][d].equals("X")) {
                    System.out.println("Parabéns Jogador 1! Você venceu!");
                    stop++;
                }
            }
        } return stop;
    }
}

