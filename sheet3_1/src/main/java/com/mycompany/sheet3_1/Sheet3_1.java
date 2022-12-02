

package com.mycompany.sheet3_1;


public class Sheet3_1 {

    public static void main(String[] args) {
        
     String  names = "mohamed,ali,hamada,ibrahim,abdelfattah,samy";
     
    for(int index=0;index<names.length();index++)
    {
        char ch = names.charAt(index);
     
        if(ch==',')
        {
            continue;
        }
        System.out.print(ch);
    
    }
    
    

      
    
    
    
        
    }
}
