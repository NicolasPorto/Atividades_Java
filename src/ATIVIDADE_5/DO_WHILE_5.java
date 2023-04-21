package ATIVIDADE_5;

import java.util.Scanner;

public class DO_WHILE_5 {
       public static void main(String arg[]){
       
       int num1 = 15;
       int num2 = 30;

        do{
 
          if((num1%2) != 0){

          System.out.println(num1);

          }
          
          num1++; 

        }while(num1 < num2);


       }
}
