

package com.mycompany.sheet2_1;
import java.util.Scanner;


public class Sheet2_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        double Largest_Element;
        
        /*get size of the array*/   
        System.out.print("Please inter the size of the array"+ " ");
        int size = input.nextInt();       
      double [] array =new double [size];
      
      
      Largest_Element=array[0];  
      
 /*get input of the array*/     
    for(int i=0;i<array.length;i++)
    {
        System.out.print("Please inter array of index " + " " + i + "\n");
        double value=input.nextDouble();
          array[i]=value;   
          
        if(array[i]>Largest_Element)
        {
           Largest_Element= array[i];
        }
        
          
    }
    
    
      
    /*display Largest Element of the array*/  
   
        System.out.print("Largest Element is  " + " "+ Largest_Element +"\n");
      
             
 
        
        
        
    }
}
