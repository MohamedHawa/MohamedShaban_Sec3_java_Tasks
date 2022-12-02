

package com.mycompany.sheet1_2;
import java.util.Scanner;

public class Sheet1_2 {
    

    public static void main(String[] args) {
   
    Scanner input = new Scanner(System.in);
     int result_fact_n=0;
     int result_fact_r=0;
     int result_fact_n_r=0;
     int factorial_n_r=1;
     int x=1;
     int ncr=0;
     int npr=0;
     int temp=1;
     
     System.out.println("please inter n");
     int n= input.nextInt();
     System.out.println("please inter r");
     int r= input.nextInt(); 
    
      result_fact_n=fact_n(n);      //   !n
     System.out.println(" n fact is  is : "+"  "+result_fact_n);
  
      result_fact_r=fact_r(r);     //    !r
      System.out.println("r fact is  is : "+"  "+result_fact_r);
 
      result_fact_n_r=(n)-(r);
      
      while(result_fact_n_r>=x)
      {
        factorial_n_r*=x;
        x++;                        //   (n-r)!
      }
      
      
      
    // calculate ncr    !n/!r*!(n-r)  
    temp=(result_fact_r)*(factorial_n_r); //   6*2
    ncr=(result_fact_n)/(temp);                //  120/12
    
    
    // calculate   npr    !n/!(n-r)     //120/2
     npr= result_fact_n/factorial_n_r;  // 60
     
    
    
    
    System.out.println("ncr is : "+"  "+ncr);  // ncr = 10
     System.out.println("npr is : "+"  "+npr); // npr =  20  
        
        
        
        
    }
 ///////////////////////////////////////////////////////////////////////////   
 /*this function calculate factorial of n*/  
     static int fact_n(int n)
    {
       int i=1;
       int factorial=1;
       
       
       if((n==0))
       {
           return 1;
       }
       else
           
       {
       
       while(n>=i)
        {
            factorial*=i++;
           
        }
       return factorial;
       }
        
        
    }
 ////////////////////////////////////////////////////////////////////////////////   
  /*this function calculate factorial*/  
     static int fact_r(int r)
    {
       int i=1;
       int factorial=1;
       
       
       if((r==0))
       {
           return 1;
       }
       else
           
       {
       
       while(r>=i)
        {
            factorial*=i++;
           
        }
       return factorial;
       }
        
        
    }
     /////////////////////////////////////////////////////////////////////////////////
     
     
}
 

