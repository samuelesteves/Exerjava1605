
package exervetor;


public class Exervetor {

   
    public static void main(String[]args) {
        
        int[] vet = {35,88,77,10,1,52,87,33,2,21,48,33};
       
        
        //Exercício A
       /*
        
        int maior = 0;
        
        for (int pos : vet) {
           
           
           if (pos > maior) {
               maior = pos;
           } 
           
           
        }
        System.out.println(maior);
        
      */  
       
       //Exerício B
       
       
       /*
       int menor = 1000000;
        
        for (int pos : vet) {
           
           
           if (pos < menor) {
               menor = pos;
           } 
           
           
        }
        System.out.println(menor);
       
       */
       
       //Exerício C
       
       /*
       int total = 0;
       int med = 0;
       int i = 0;
       
       for (int pos : vet) {
           total = total + pos;
           i++;
       }
       
       //med = total / vet.length;
       med = total / i;
       
        System.out.println(med);
        
        */
       
       //Ecercício D
       
       /*
       for (int pos : vet) {
           if (pos % 2 == 0) {
               System.out.println(pos);
           }
       }
       
       */
       
       //Ecerício E
       
       /*
       for (int pos : vet) {
           if (pos % 2 != 0) {
               System.out.println(pos);
           }
       }

       */
       
       
    } 
    
}
