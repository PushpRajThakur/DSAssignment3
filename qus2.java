import java.util.*;
class qus2 {
static void rev(int arr[],int i, int j)
{
  int temp;        
  if(i < j)
  {
    temp = arr[i]; 
    arr[i] = arr[j];
    arr[j] = temp;
    rev(arr, ++i, --j);
  } 
}     
 public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       System.out.print("Enter the number of elements in an  Array : "); 
       int n=s.nextInt();
        int[] arr=new int[n];
       System.out.print("Enter the elements in an  Array : ");
       for(int i=0;i<n;i++)
        {
          arr[i]=s.nextInt();
        }  
        rev(arr, 0, n-1);
        System.out.println(Arrays.toString(arr)); 
        
    }
}