import java.util.*;
class qus1
{
     static int search(int arr[], int a, int b, int c)
     {
          if (b < a)
             return -1;
          if (arr[a] == c)
             return a;
          return search(arr, a+1, b, c);
     }
    
     public static void main(String[] args) 
     {
       Scanner s=new Scanner(System.in);
       System.out.print("Enter the number of elements in array "); 
       int n=s.nextInt();
        int[] arr=new int[n];
       System.out.print("Enter the elements in  Array : ");
       for(int i=0;i<n;i++)
        {
          arr[i]=s.nextInt();
        }
       System.out.print("Enter the element to search : ");
       int m=s.nextInt();
        int index = search(arr, 0, n-1, m);
         if (index != -1)
           System.out.println( m + " is present");
        else
            System.out.println( n + " is not present");
        }
 }
