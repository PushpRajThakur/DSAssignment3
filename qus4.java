import java.util.*;
class qus4{
  static int power(int x, int y){
        if (y != 0)
            return (x * power(x,y- 1));
        else
            return 1;
    }
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int b=s.nextInt();      
    int c = power(a,b);
    System.out.println(c);
    }
}