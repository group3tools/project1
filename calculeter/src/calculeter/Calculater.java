

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
}
  