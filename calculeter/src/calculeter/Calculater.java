

package calculeter;

import java.util.Scanner;

   


public class Calculater {
static int a,b;
public int add(){
    int sum;
    sum=a+b;
    return sum;
} 
public int multiply(){
    int pro;
    pro=a*b;
    return pro;
}
public float Divide(){
   
    float div=0;
    if(b!=0){
    div=a/b;    
    }
    else{
        System.out.println("invalid input");
    }
return div;
}
public int subtract(){
    int sub=a-b;
    
    return sub;
}
 public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the two numberes");
         a=s.nextInt();
         b=s.nextInt();
         Calculater c=new Calculater();
        
         System.out.println("the sum of the numberes is "+c.add());
         System.out.println("the product of the numberes is "+ c.multiply());
         System.out.println("the division of the numberes is "+c.Divide());
         System.out.println("the substraction of the numberes is "+c.subtract());
         
    }
    
}
  