import java.util.Scanner;
public class Arithmeticprogression {
    public static void main(String[] args){
    int n,max;
    Scanner s= new Scanner(System.in);
    System.out.print("enter the number of elements in an array");
    n=s.nextInt();
    int a[]=new int[10];
    System.out.println("enter the elements of array");
    for(int i=0;i<n;i++)
    {
        a[i]=s.nextInt();
    }
    max=a[0];
    for(int i=0;i<n;i++)
    {
        if(max<a[i])
       {
        max=a[i];
     }
}
System.out.println(max);
     }
}
    
