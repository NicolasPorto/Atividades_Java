package ATIVIDADE_7;

import java.util.Scanner;

public class WHILE_7 {
       public static void main(String arg[]){

       int num = 1;
       int soma = 0;

           while(num <= 200){

                if(num >= 100){

                   if((num%2) == 0){

                   System.out.println(num);

                   soma = soma + num;

                   }

                }

           num++;

           }
    
       System.out.println("A soma dos números pares é:" + soma);

       }    
}
