
//NOME DO INTEGRANTES: Matheus Soares Beraldo, João Pedro marques dos Santos,Vitor Hugo Arcomim.


import java.util.Random;
import java.util.Scanner;
public class jogodavelha {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[][] tabuleiro = new int[3][3];

        Random random = new Random();
        
        int jogo = 0;

        while (jogo == 0){
            System.out.println("Escolha uma posição para jogar (linha e coluna):");
            System.out.println();
            
            int linha = ler.nextInt();
            int coluna = ler.nextInt();

            if (tabuleiro[linha][coluna] == 0){
                tabuleiro[linha][coluna] = 1;

                boolean jogadorVenceu =
                        tabuleiro[0][0] == 1 && tabuleiro[0][1] == 1 && tabuleiro[0][2] == 1 ||
                        tabuleiro[1][0] == 1 && tabuleiro[1][1] == 1 && tabuleiro[1][2] == 1 ||
                        tabuleiro[2][0] == 1 && tabuleiro[2][1] == 1 && tabuleiro[2][2] == 1 ||
                        tabuleiro[0][0] == 1 && tabuleiro[1][0] == 1 && tabuleiro[2][0] == 1 ||
                        tabuleiro[0][1] == 1 && tabuleiro[1][1] == 1 && tabuleiro[2][1] == 1 ||
                        tabuleiro[0][2] == 1 && tabuleiro[1][2] == 1 && tabuleiro[2][2] == 1 ||
                        tabuleiro[0][0] == 1 && tabuleiro[1][1] == 1 && tabuleiro[2][2] == 1 ||
                        tabuleiro[0][2] == 1 && tabuleiro[1][1] == 1 && tabuleiro[2][0] == 1;

                boolean tabuleiroCheio = true;
                System.out.println();

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (tabuleiro[i][j] == 0) {
                            tabuleiroCheio = false;
                        }
                    }
                }

                if (jogadorVenceu) {
                    System.out.println("Parabéns, você venceu!");
                    System.out.println();
                    jogo = 1;
                    continue;
                }

                if (tabuleiroCheio) {
                    System.out.println("O jogo empatou!");
                    System.out.println();
                    jogo = 1;
                    continue;
                }

                int linhaMaquina;
                int colunaMaquina;

                do {
                    linhaMaquina = random.nextInt(3);
                    colunaMaquina = random.nextInt(3);
                } while (tabuleiro[linhaMaquina][colunaMaquina] != 0);

                tabuleiro[linhaMaquina][colunaMaquina] = 2;

                System.out.println("A máquina jogou na posição: "
                        + linhaMaquina + " " + colunaMaquina);
                        System.out.println();
            } else {
                System.out.println("Posição já ocupada, tente novamente.");
                System.out.println();
                continue;
            }


           if(tabuleiro[0][0] == 1 && tabuleiro[0][1] == 1 && tabuleiro[0][2] == 1 ||
              tabuleiro[1][0] == 1 && tabuleiro[1][1] == 1 && tabuleiro[1][2] == 1 ||
              tabuleiro[2][0] == 1 && tabuleiro[2][1] == 1 && tabuleiro[2][2] == 1 ||
              tabuleiro[0][0] == 1 && tabuleiro[1][0] == 1 && tabuleiro[2][0] == 1 ||
              tabuleiro[0][1] == 1 && tabuleiro[1][1] == 1 && tabuleiro[2][1] == 1 ||
              tabuleiro[0][2] == 1 && tabuleiro[1][2] == 1 && tabuleiro[2][2] == 1 ||
              tabuleiro[0][0] == 1 && tabuleiro[1][1] == 1 && tabuleiro[2][2] == 1 ||
              tabuleiro[0][2] == 1 && tabuleiro[1][1] == 1 && tabuleiro[2][0] == 1){
                System.out.println("Parabéns, você venceu!");
                System.out.println();
                jogo = 1;
            } else if(
              tabuleiro[0][0] == 2 && tabuleiro[0][1] == 2 && tabuleiro[0][2] == 2 ||
              tabuleiro[1][0] == 2 && tabuleiro[1][1] == 2 && tabuleiro[1][2] == 2 ||
              tabuleiro[2][0] == 2 && tabuleiro[2][1] == 2 && tabuleiro[2][2] == 2 ||
              tabuleiro[0][0] == 2 && tabuleiro[1][0] == 2 && tabuleiro[2][0] == 2 ||
              tabuleiro[0][1] == 2 && tabuleiro[1][1] == 2 && tabuleiro[2][1] == 2 ||
              tabuleiro[0][2] == 2 && tabuleiro[1][2] == 2 && tabuleiro[2][2] == 2 ||
              tabuleiro[0][0] == 2 && tabuleiro[1][1] == 2 && tabuleiro[2][2] == 2 ||
              tabuleiro[0][2] == 2 && tabuleiro[1][1] == 2 && tabuleiro[2][0] == 2){
                System.out.println("A máquina venceu!");
                System.out.println();
                jogo = 1;
            } else {
                boolean empate = true;
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (tabuleiro[i][j] == 0) {
                            empate = false;
                            break;
                        }
                    }
                    if (!empate) {
                        break;
                    }
                }
                if (empate) {
                    System.out.println("O jogo empatou!");
                    jogo = 1;
                    System.out.println();
                }
            }
        }

        System.out.println("Resultado final do tabuleiro:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println();
        }

    }
}
