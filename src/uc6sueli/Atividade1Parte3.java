
package uc6sueli;

import java.util.Scanner;

public class Atividade1Parte3 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        double valorDiaria=0.0;
        String nomeHospede ="";
	int idade=0;
        int gratuidade;
        int meiaDiaria;
        double valorGratuidade=0.0;
        double valorMeia=0.0; 
        double valorTotal=0.0;
        double total=0.0;

        gratuidade = 0;
	meiaDiaria = 0;

          System.out.println(" Digite o valor da diária: ");
          valorDiaria = entrada.nextDouble();
			     	     	    
        do
	     {
			
	  System.out.println(" \nDigite o nome do Hóspede: ");
          nomeHospede = entrada.next();
          if (!"pare".equals(nomeHospede));
                                   
		   {				
		    System.out.println("\nDigite qual a idade: ");
		    idade = entrada.nextInt();
		
		   if (idade <= 4)
		   if (idade >= 0)
		    {
		    System.out.println(" H�spede possui gratuidade. \n");
		    gratuidade++;
		    }
		    
		   if (idade >= 80)
		   {
		    System.out.println(nomeHospede +"Paga meia. \n");
                    
			valorTotal = valorTotal + valorDiaria / 2;
			meiaDiaria++;
		   }
		
             if (idade > 4 && idade <80)
             {
          	valorTotal = valorTotal + valorDiaria;
             }

     
	        }
	      }
     while (!"pare".equals(nomeHospede));
        
     System.out.println("\n Total de Hospedagens: R$ " +valorTotal+ "; " +gratuidade+ " gratuidade(s); " +meiaDiaria+ " meia(s) \n"); 
    }
}
