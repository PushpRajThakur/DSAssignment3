import java.util.*;
class qus5{
static int add(int n)
    { 
        if (n == 0)
            return 0;
        return (n % 10 + add(n / 10));
    }
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
String str =s.next();
int a=Integer.parseInt(str);
int S=add(a);
System.out.print("sum is "+ S);
}
}