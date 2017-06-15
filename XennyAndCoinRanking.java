package JUNE17;

import java.util.Scanner;

/**
 * Created by Rukshar Alam on 6/12/2017.
 */
public class XennyAndCoinRanking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();

        for(int t = 0;t<testCases;t++)
        {
            int indexX = sc.nextInt();int indexY = sc.nextInt();
            if(indexX == 0 && indexY == 0)
            {
                System.out.println("1");
            }
            else
            {
                int rank = 2;
                int maxX  = 1, maxY = 1, tempX = 0, tempY = 1;
                boolean found = false;
                while (!found)
                {
                    if(tempX == indexX && tempY ==indexY)
                    {
                        ///System.out.println("matched case");
                        //rank++;
                        found = true;
                    }
                    else if(tempX == maxX && tempY ==0)
                    {
                        //System.out.println("limit reached case");
                        maxX++; maxY++;
                        tempX = 0; tempY = maxY;
                        rank++;
                    }
                    else
                    {
                        rank++;
                        tempX++; tempY--;
                        //System.out.println("UNmatched case rank "+rank+"tempx: "+tempX+"tempY: "+tempY);
                    }
                }

                System.out.println(rank);
            }

        }
    }
}
