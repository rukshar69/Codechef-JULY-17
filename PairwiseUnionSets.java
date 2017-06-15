package JUNE17;

import java.util.Scanner;

/**
 * Created by Rukshar Alam on 6/12/2017.
 */
public class PairwiseUnionSets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for(int t = 0;t<testCases;t++)
        {
            int n = sc.nextInt(); int k = sc.nextInt(); sc.nextLine();
            int a[][] = new int[n][];
            int size[] = new int[n];
            for(int i = 0;i<n;i++)
            {
                size[i] = sc.nextInt();
                a[i] = new int[size[i]];
                for(int j = 0;j<size[i];j++)
                {
                    a[i][j]=sc.nextInt();
                }

            }

            int validPair = 0;

            for(int i = 0;i<n-1;i++)
            {

                for(int j = i+1;j<n;j++)
                {
                    int range[] = new int[k];
                    for(int c = 0;c<k;c++){range[c]=0;}

                    int s1 = size[i], s2 = size[j];
                    for(int c = 0;c<s1;c++)
                    {
                        range[a[i][c] - 1]++;
                    }
                    for(int c = 0;c<s2;c++)
                    {
                        range[a[j][c] - 1]++;
                    }
                    boolean flag = true;
                    for(int c = 0;c<k;c++){
                        if(range[c] == 0)
                        {
                            flag = false; break;
                        }
                    }

                    if(flag)
                    {
                        validPair++;
                    }

                }

            }
            System.out.println(validPair);





        }
    }
}
