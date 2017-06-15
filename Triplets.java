package JUNE17;

import java.util.Scanner;

/**
 * Created by Rukshar Alam on 6/12/2017.
 */
public class Triplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for(int t = 0;t<testCases;t++)
        {
           int p = sc.nextInt();int q = sc.nextInt();int r = sc.nextInt();
           int a[] = new int[p];int b[] = new int[q];int c[] = new int[r];
           for(int i = 0;i<p;i++)
           {
               a[i] = sc.nextInt();
           }
            for(int i = 0;i<q;i++)
            {
                b[i] = sc.nextInt();
            }
            for(int i = 0;i<r;i++)
            {
                c[i] = sc.nextInt();
            }
            int sum = 0;

            for(int i = 0;i<p;i++)
            {
                int first = a[i];
                for(int j = 0;j<q;j++)
                {
                    int second = b[j];
                    for(int k = 0;k<r;k++)
                    {
                        int third = c[k];
                        if(first<= second && second>= third)
                        {
                            sum += (first+second)*(second+third);

                        }
                    }
                }
            }
            System.out.println(sum);
        }
    }
}
