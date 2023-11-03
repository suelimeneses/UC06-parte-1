package uc6sueli;

import java.util.Scanner;

public class Atividade1Parte5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String andarQuartos[][] = new String[4][3];
        String ocupado = "ocupado";
        String parar = "n";
        int andar;
        int quarto;

        for (int I = 0; I <= 3; I++) {
            for (int J = 0; J <= 2; J++) {
                andarQuartos[I][J] = "desocupado";
            }
        }

        do {
            do {
                System.out.println("Informe Andar e Quarto\n" + "Andar: ");
                andar = entrada.nextInt();
                
                if (andar > 4 || 0 >= andar) {
                    System.out.println("Andar inválido.");
                }
            } while (andar > 4 || 0 >= andar);

            System.out.println("Quarto: ");
            quarto = entrada.nextInt();

            for (int I = 0; I <= 3; I++) {

                 for (int J = 0; J <= 2; J++) {

                    andarQuartos[andar - 1][quarto - 1] = ocupado;

                }
            }

            System.out.println("Deseja informar outra ocupação? (s/n)");
            parar = entrada.next();

        } while (parar.equals("s"));

        for (int I = 0; I <= 3; I++) {

            System.out.println((I + 1) + " º andar:");

            for (int J = 0; J <= 2; J++) {

                System.out.println("- quarto " + (J + 1) + " " + andarQuartos[I][J] + "\n");

            }
        }
    }

}
