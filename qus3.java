import java.util.*;
class qus3
{ 
    static int fibon(int n) 
    { 
    if (n <= 1) 
       return n; 
    else    
    return fibon(n-1) + fibon(n-2); 
    } 
       
    public static void main (String args[]) 
    { 
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    System.out.println(fibon(n)); 
    } 
}