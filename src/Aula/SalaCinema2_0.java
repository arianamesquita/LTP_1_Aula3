package Aula;

import java.util.Arrays;
import java.util.Scanner;

public class SalaCinema2_0 {
    // simule reservas de assentos em um cinema -> 3 fileiras de 4 lugares cada
    // programa repete at� usu�rio digitar 0 0 0 ou todos assentos ocupados
    // programa repete at� que todos assentos estejam ocupados
    // nome, n� assento, n� fila, n� assento s�o lidos
    // se assento estiver dispon�vel, nome ser� armazenado na linha e coluna da matriz
    // se estiver ocupado, imprimir ocupado
    // m�todos: declarar a sala no programa principal; escreva uma fun��o para imprimir as reservas atuais;
    // fun��o para inicializar as reservas; fun��o ler entradas e verificar disponibilidade assento desejado.
    public static void main(String[] args) {
        String[][] salaCinema = new String[3][4];
        Scanner scan = new Scanner(System.in);
        int coluna, fileiraNum, count = 0, i;
        String nome;

        System.out.println("Seja bem vindo! O cinema tem 3 fileiras com 4 assentos em cada.");
        System.out.println("As reservas de assentos at� o momento s�o:");
        for (i = 0; i < salaCinema.length; i++){
            Arrays.fill(salaCinema[i],"*");
        }
        do{
            imprimeSala(salaCinema);
            System.out.println("\nDigite o seu primeiro nome ou, se quiser sair, digite 0.");
            nome = scan.next();
            if (!nome.equals("0")){
                System.out.println("\nEntre com a sua solicita��o de reserva de assento. Fileira e coluna:");
                fileiraNum = scan.nextInt();
                coluna = scan.nextInt();
                System.out.printf("\n%s, o assento escolhido est� na fileira %s e na coluna %s", nome, fileiraNum, coluna);
                boolean z = verificaAssento(fileiraNum, coluna, salaCinema);
                if (z){
                    System.out.println("\nO assento est� liberado!");
                    salaCinema[fileiraNum][coluna] = nome;
                    count++;
                } else {
                    System.out.println("\nO assento est� ocupado! Escolha novamente!");
                }
            }
            if (count == 12){
                imprimeSala(salaCinema);
                System.out.println("Sess�o de cinema cheia!");
                break;
            }
            if (nome == "0") {
                System.out.println("At� mais!");
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
