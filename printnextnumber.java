import java.util.Scanner;
public class Printnextnumber {
    public static void main(String[] args) {
        int i,n,sum=0;
        Scanner s= new Scanner(System.in);
        System.out.println("enter the number:");
        n=s.nextInt();
        for(i=0;i<=n;i++)
        {
            sum=sum+1;
        }
        System.out.println("the next number:"+sum);
        
    }
    
}
