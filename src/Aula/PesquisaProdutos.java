package Aula;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class PesquisaProdutos {
    // matriz 10 produtos -> pesquisa satisfa��o sobre um produto (random) -> 50 pessoas sobre cada item
    // notas 1 a 10 -> ler todas avalia��es
    // utilize matrizes e seja criativo nos gr�ficos
    //%.1f - imprime somente uma casa decimal ap�s a v�rgula

    public static void main(String[] args) throws InterruptedException {
        String[] produtos = {"01 - A", "02 - B", "03 - C", "04 - D", "05 - E", "06 - F", "07 - G", "08 - H", "09 - I", "10 - J"};
        int[][] notasProdutos = new int[10][50];
        Random rand = new Random();
        int i;
        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("\n\n Seguem as op��es para confer�ncia.");
            System.out.println("[a] - mostrar m�dia de avalia��o de todos os produtos.");
            System.out.println("[b] - mostrar m�dia e frequ�ncia de um produto espec�fico.");
            System.out.println("[c] - mostrar gr�fico com m�dia de avalia��es.");
            System.out.println("[d] - mostrar gr�fico com a frequ�ncia das avalia��es para um determinado produto");
            System.out.println("[e] - sair do programa.");
            System.out.println("\nDigite a op��o desejada.");
            String resposta = scan.next();
            if (!Objects.equals(resposta, "e")){
                System.out.print("Produtos" + " ->  |" + "--------------------Notas dos Produtos--------------------" + "\n");
                for (i = 0; i < 10; i++){
                    System.out.print(produtos[i] + " ->    |");
                    for (int j = 0; j < 50; j++){
                        notasProdutos[i][j] = rand.nextInt(0, 11);
                        System.out.print(" " + notasProdutos[i][j] + " | ");
                    }
                    System.out.println(" ");
                }
            }
            switch (resposta.toLowerCase()) {
                case "a": // mostrar m�dia de avalia��o dos produtos
                    for (i = 0; i < 10; i++) {
                        System.out.printf("\nA m�dia de notas do produto %s foi de: %.1f\n", produtos[i], calculaMediaVetor(notasProdutos[i]));
                    }
                    System.out.println("-----------------------------------------------");
                    break;
                case "b": // mostrar m�dia e frequ�ncia de produto espec�fico
                    mediaFrequencia(notasProdutos);
                    break;
                case "c": // gr�fico com m�dia das avalia��es
                    int[] medias = new int[10];
                    for (i = 0; i < 10; i++) {
                        medias[i] = (int) calculaMediaVetor(notasProdutos[i]);
                    }
                    graficoMedia(produtos, medias);
                    break;
                case "d": // gr�fico com a frequ�ncia das avalia��es para um determinado produto
                    graficoAvaliacaoProduto(produtos, notasProdutos);
                    break;
                case "e":
                    break;
            }
            if(Objects.equals(resposta, "e")){
                System.out.println("Sistema finalizado!!");
                break;
            }
        }
    }
    public static float calculaMediaVetor(int[] vetor) {
        // a) m�dia de avalia��o de todos os produtos
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        } return (float) (soma / vetor.length); //retorna a m�dia
    }
    public static void mediaFrequencia (int[][] vetor){
        // m�dia e frequ�ncia de um produto espec�fico
        int[] fr = new int[11];
        Scanner ler = new Scanner(System.in);
        System.out.println("Escolha o produto para frequ�ncia das notas, digite o n�mero do produto.");
        int i = ler.nextInt();
        for (int j = 0; j < 50; j++) {
            ++fr[(vetor[i-1][j])];
        }
        System.out.println("\n-------------------------------");
        System.out.println("|  Avalia��o    |    Frequ�ncia  |");
        for (i = 0; i < 11; i++) {
            System.out.println("|\t\t" + (i) + "\t\t| \t\t" + fr[i] + "\t\t|");
        }
    }
    public static void graficoMedia (String[] vetor, int[] produto){
        int[] print = new int[10];
        System.out.println("\n___________________________________");
        System.out.println("  M�dia de Avalia��es dos Usu�rios");
        System.out.println("___________________________________");
        for(int b = 0; b < 10; b++){
            System.out.printf("\nProduto: %s -> M�dia: %s", vetor[b], produto[b]);
        }
        System.out.println("\n___________________________________");
        for(int a = 0; a < 10; a++){
            System.out.print(vetor[a] + " |");
            print[a] = Math.round(produto[a]);
            for (int b = 10; b >= 0; b--){
                while (print[a] >= 0){
                    System.out.print("# ");
                    print[a]--;
                }
            }
            System.out.print("\n");
        }
        System.out.println("___________________________________");
        System.out.print("       |");
        for(int a = 0; a < 11; a++){
            System.out.print(a + " ");
        }
        System.out.println("\n           Notas dos Usu�rios");
        System.out.println("___________________________________");
    }
    public static void graficoAvaliacaoProduto (String[] vetor, int[][] produto) {
        // d) gr�fico com a frequ�ncia das avalia��es para um determinado produto
/*        int[] print2 = new int[11]; // notas na horizontal
        int[] fr2 = new int[11];
        Scanner ler = new Scanner(System.in);
        System.out.println("Escolha o produto para o gr�fico das avalia��es, digite o n�mero do produto.");
        int i = ler.nextInt();
        for (int j = 0; j < 50; j++) {
            ++fr2[(produto[i-1][j])];
        }
        System.out.println("\n\n___________________________________");
        System.out.println("  M�dia de Notas dos Usu�rios");
        System.out.println("___________________________________");
        System.out.println("Notas de 0 a 10 na vertical");
        System.out.println("___________________________________");
        for(int a = 0; a < 11; a++){
            if (a < 10){
                System.out.printf("%01d%s |", 0, a);
            }
            if (a == 10){
                System.out.printf("%s |", a);
            }
            print2[a] = fr2[a];
            for (int b = 10; b >= 0; b--){
                while (print2[a] >= 0){
                    System.out.print("# ");
                    print2[a]--;
                }
            }
            System.out.print("\n");
        }
        System.out.println("___________________________________");
        System.out.print("   |");
        for(int a = 0; a < 11; a++){
            System.out.print(a + " ");
        }
        System.out.println("\nQuantidade de pessoas que \nvotaram em cada nota");*/
        int[] fr2 = new int[11]; // gr�fico imprime na vertical
        String[][] frequencia = new String[11][11];
        Scanner ler = new Scanner(System.in);
        System.out.println("Escolha o produto para o gr�fico das avalia��es, digite o n�mero do produto.");
        int i = ler.nextInt();
        for (int j = 0; j < 50; j++) {
            ++fr2[(produto[i-1][j])];
        }
        System.out.println(Arrays.toString(fr2));
        for (int a = 0; a < 11; a++){
            for (int b = 0; b < 11; b++){
                if (fr2[a] > b-1){
                    frequencia[a][b] = "#";
                } else if (fr2[a] <= b-1) {
                    frequencia[a][b] = " ";
                }
            }
        }
        System.out.println(Arrays.deepToString(frequencia));
        System.out.println("\n\n___________________________________");
        System.out.println("  M�dia de Notas dos Usu�rios");
        System.out.println("___________________________________");
        System.out.println("Notas de 0 a 10 na vertical");
        System.out.println("___________________________________");
        for(int a = 10; a >= 0; a--){
            System.out.print(a + "   ");
            for (int b = 0; b < 11; b++){
                System.out.print(frequencia[b][a]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
        System.out.println("___________________________________");
        System.out.print("   |");
        for(int a = 0; a < 11; a++){
            System.out.print(a + " ");
        }
        System.out.println("\nQuantidade de pessoas que \nvotaram em cada nota");

    }
}
