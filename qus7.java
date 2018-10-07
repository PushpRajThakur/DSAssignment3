import java.util.*;
class qus7{
static  boolean bal(String s, int first, int last)
{
   
   if (first == s.length())
   {
    return last == 0;
   }
   if (last<0)
   {
    return false;
   }
   if (s.charAt(first) == '(' || s.charAt(first) == '{' || s.charAt(first) == '[')
   {
     return bal(s, first+1, last+1);
	 }
   if (s.charAt(first) == ')' || s.charAt(first) == '}' || s.charAt(first) == ']')
 
     return bal(s, first+1, last-1);
	 
   return bal(s, first+1, last );
   
}
public static void main(String[] args){
Scanner s1=new Scanner(System.in);
String str=s1.next();
int first=0,last=0;
boolean flag=bal(str,first,last);
if(flag==true)
System.out.print("Balanced");
else
System.out.print("Not Balanced");
}
}