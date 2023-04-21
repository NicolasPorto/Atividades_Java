package ATIVIDADE_7;

import java.util.Scanner;

public class FOR_7 {
       public static void main(String arg[]){

       int num;
       int soma = 0;

            for(num = 100; num <= 200; num++){

                if((num%2) == 0){
           
                soma = soma + num;

                System.out.println(num);                

                } 

            }
            System.out.println("A soma dos números pares é:" +soma);
       }    
}
