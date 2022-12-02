
package com.mycompany.sheet2_2;


public class Sheet2_2 {

    public static void main(String[] args) {
        
        
     /*inaiatlization of tha 2d matrix*/   
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        
        
        
        
    /*display matrix after transpose*/
       for(int col=0;col<3;col++)
       {
           for(int row =0;row<3;row++)
           {
               System.out.print(" "+matrix[row][col]);  
           }
         System.out.println();
       }
        
    
        
        
    }
}
