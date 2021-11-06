import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


// ENUNCIADO:

/* Donats dos nombres n1 <= n2 imprimeix aquells que siguin parells en l'interval [n1,n2].

Input Format

Introduïm dos enters n1 i n2.

Constraints

No n'hi ha.

Output Format

Imprimim els nombres enters en l'interval [n1,n2].

Sample Input 0

1 10
Sample Output 0

2
4
6
8
10
  */


public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        while (n1 <= n2)
        {
            if (n1 %2 ==1)
            {

                n1++;
            }

            System.out.println(n1);
            n1= n1 + 2;
        }
    }
}
