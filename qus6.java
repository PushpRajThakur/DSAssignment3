import java.util.*;
class qus6{
public static String removeduplicates(String s)
{
    if ( s.length() <= 1 )
    { return s;
    }
    if( s.substring(1,2).equals(s.substring(0,1)) )
    { 
    return removeduplicates(s.substring(1));
    }
    else 
    {
    return s.substring(0,1) + removeduplicates(s.substring(1));
    }
}

public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.print("Enter the String");
String str =s.next();
String str2=removeduplicates(str);
System.out.print(str2);
}
}