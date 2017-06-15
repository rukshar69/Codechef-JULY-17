package JUNE17;

import java.util.Scanner;

/**
 * Created by Rukshar Alam on 6/12/2017.
 */
public class AGoodSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for(int t = 0;t<testCases;t++)
        {
            int n = sc.nextInt();
            if(n == 1)
            {
                System.out.println("7");
            }
            else if(n == 2)
            {
                System.out.println("1 2");
            }
            else
            {
                int num = 500;
                for(int i = 1;i<=n;i++)
                {
                    System.out.print(num+" ");
                    num--;
                }
                System.out.println();
            }
        }
    }
}
