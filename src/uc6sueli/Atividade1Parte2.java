
package uc6sueli;

import java.util.Scanner;


public class Atividade1Parte2 {
   
     public static void main(String[] args) 
     {         
       
 Scanner entrada = new Scanner(System.in);

        String nome;
        String name;
        String nomeMaior;
        String nomeMenor;
        String velhoMaior;
        String velhoMenor;
        int idade;
        int idad;
        int velho = 60;
          
        
        System.out.println("Digite o nome do Hospede: ");
        nome = entrada.next();

        System.out.println("Digite a idade do Hospede: ");
        idade = entrada.nextInt();

        System.out.println("Digite o nome do  Hospede: ");
        name = entrada.next();

        System.out.println("Digite a idade do Hospede: ");
        idad = entrada.nextInt();

        if (idad < 0 && idade < 0) 
        {
            System.out.println("Idade invÃƒÂ¡lida, digite uma idade maior que 0!");
        }
        else if (idad < velho && idade < velho) 
        {
            nomeMaior = nome;
            nomeMenor = name;

            System.out.println("Quarto A " + nomeMenor );
            System.out.println( " Quarto B " +  nomeMaior);
        }
        else if (idade >= velho && idad < velho) {
             nomeMaior = nome;
             nomeMenor = name;
            System.out.println("Quarto A " + nomeMaior + " com desconto de 40%");
            System.out.println("Quarto B " + nomeMenor );
        }
        else if (idad >= velho && idade < velho) {
            nomeMaior = nome;
            nomeMenor = name;
            System.out.println("Quarto A " + nomeMenor + " com desconto de 40%");
            System.out.println(" Quarto B " + nomeMaior );
        }
        if (idad >= velho && idade >= velho) 
        {
            velhoMaior = nome;
            velhoMenor = name;

            System.out.println( " Quarto A: " + velhoMaior + " com desconto de 40%" );           
            System.out.println( " Quarto B: " + velhoMenor + " com desconto de 40%" );
        }

     }
     
}