import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("How many rows and columns you want???");
        n= sc.nextInt();
        System.out.println("\n\n");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j || i+j==n-1 || i==0 || j==0 || i==n-1 || j==n-1)
                {
                    System.out.print("* ");

                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}