package uc6sueli;

import java.util.Scanner;

public class Atividade1Parte4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String[] nome = new String[15];
        String nomeHosp;
        String nomeBusca;
        String parar = "n";
        int termoBusca = 0;
        int pos = 0;
        int semCad = 0;

        do {

            System.out.println(" Digite o termo da busca: 1- cadastrar; 2- pesquisar; 3- sair. ");
            termoBusca = entrada.nextInt();

            if (termoBusca == 1) {
                if (nome[14] != null) {
                    System.out.println(" Máximo de cadastros atingidos.");
                }

                System.out.println(" Digite o nome do Hóspede: ");
                nomeHosp = entrada.next();

                for (int i = 0; i < 15; i++) {
                    if (nome[i] == null) {
                        nome[i] = nomeHosp;
                        break;
                    }

                }
            }

            if (termoBusca == 2) {
                System.out.println(" Digite o nome do Hóspede á buscar: ");
                nomeBusca = entrada.next();
                for (int i = 0; i < 15; i++) {
                    if (nomeBusca.equals(nome[i])) {
                        System.out.println("Hóspede " + nome[i] + " foi encontrado no índice " + i + "\n");
                        break;
                    }
                    if (!nomeBusca.equals(nome[i])) {
                        semCad = semCad + 1;
                    }
                    if (semCad == 15) {
                        System.out.println("Hóspede não foi encontrado.\n");
                        break;
                    }
                }
            }

        } while (termoBusca != 3);
    }

}
