
package uc6sueli;

import java.util.Scanner;


public class Atividade1Parte1 {

  
    public static void main(String[] args) {
               
        Scanner entrada = new Scanner(System.in);
        
        int numConvid;
        int alfa;
        int beta;
        int resultado1;
        int resultado2;
                
                
        System.out.println(" Digite o número de convidados para o evento: ");
        numConvid = entrada.nextInt();
      
                
		if (numConvid <= 350)
		{
		System.out.println(" \n");
		}
		if (numConvid > 350)
		{
		System.out.println(" Número de convidados inválido. ");
		}
		if (numConvid <= 0)
		{
		System.out.println(" Número de convidados inválido. \n");
		}
		if (numConvid <= 220)
		if (numConvid != 0)
		if (numConvid >= 0)
		{
		System.out.println(" Auditório mais adequado é o Auditório Alfa. \n");
		}
		if (numConvid <= 350)
		if (numConvid >= 221)
		if (numConvid != 0)
		if (numConvid >= 0)
		{
		System.out.println(" Auditório mais adequado é o Auditório Beta. \n");
		}
		
      alfa = 150;
     
     resultado1 = numConvid-alfa;


          if (numConvid <= 220)
          if (numConvid != 0)
          if (numConvid >= 151)
          {         
          System.out.println(" \n Para essa quantidade de convidados será necessário adicionar " +resultado1+ " cadeiras.");
          }
          else         
          {
          System.out.println(" \n");
          }
    }
    
}
