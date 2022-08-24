package Aula;

import java.util.Arrays;
import java.util.Scanner;

public class SalaCinema2_0 {
    // simule reservas de assentos em um cinema -> 3 fileiras de 4 lugares cada
    // programa repete até usuário digitar 0 0 0 ou todos assentos ocupados
    // programa repete até que todos assentos estejam ocupados
    // nome, nº assento, nº fila, nº assento são lidos
    // se assento estiver disponível, nome será armazenado na linha e coluna da matriz
    // se estiver ocupado, imprimir ocupado
    // métodos: declarar a sala no programa principal; escreva uma função para imprimir as reservas atuais;
    // função para inicializar as reservas; função ler entradas e verificar disponibilidade assento desejado.
    public static void main(String[] args) {
        String[][] salaCinema = new String[3][4];
        Scanner scan = new Scanner(System.in);
        int coluna, fileiraNum, count = 0, i;
        String nome;

        System.out.println("Seja bem vindo! O cinema tem 3 fileiras com 4 assentos em cada.");
        System.out.println("As reservas de assentos até o momento são:");
        for (i = 0; i < salaCinema.length; i++){
            Arrays.fill(salaCinema[i],"*");
        }
        do{
            imprimeSala(salaCinema);
            System.out.println("\nDigite o seu primeiro nome ou, se quiser sair, digite 0.");
            nome = scan.next();
            if (!nome.equals("0")){
                System.out.println("\nEntre com a sua solicitação de reserva de assento. Fileira e coluna:");
                fileiraNum = scan.nextInt();
                coluna = scan.nextInt();
                System.out.printf("\n%s, o assento escolhido está na fileira %s e na coluna %s", nome, fileiraNum, coluna);
                boolean z = verificaAssento(fileiraNum, coluna, salaCinema);
                if (z){
                    System.out.println("\nO assento está liberado!");
                    salaCinema[fileiraNum][coluna] = nome;
                    count++;
                } else {
                    System.out.println("\nO assento está ocupado! Escolha novamente!");
                }
            }
            if (count == 12){
                imprimeSala(salaCinema);
                System.out.println("Sessão de cinema cheia!");
                break;
            }
            if (nome == "0") {
                System.out.println("Até mais!");
            }
        } while(!nome.equals("0"));
    }
    public static void imprimeSala(String[][] n){
        String[] fileira = {"A", "B", "C"};
        int i;
        System.out.println();
        for (i = 0; i < 4; i++){
            System.out.print("\t\t    " + i + "\t    ");
        }
        System.out.println();
        for (i = 0; i < n.length; i++){
            System.out.println( );
            System.out.printf(fileira[i] + "-" + i + "   |  ");
            for (int j = 0; j < n[0].length; j++){
                System.out.print("\t\t " + n[i][j] + "     |    ");
            }
            System.out.println( );
            System.out.println(" ");
        }
    }
    public static boolean verificaAssento(int a, int b, String[][] n) {
        return n[a][b].equals("*");
    }
}
