

package com.mycompany.sheet3_2;
import java.util.Scanner;

public class Sheet3_2 {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    Triangle  obj1 = new Triangle();
    Circle    obj2 = new Circle();
    
    System.out.println(obj1.Get_Triangle_area(10.0,10.0)) ;          // 100.0
    System.out.println(obj1.Get_Triangle_circumference(10.0,10.0)) ; // 40.0
    System.out.println(obj2.Get_Circle_area(2.0)) ;                  // 19.7192
    System.out.println(obj2.Get_Circle_circumference(2.0)) ;         // 12.56
    
    
    
        
        
        
        
    }
}
