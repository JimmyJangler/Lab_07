public class Get_Loopy
{
    public static void main(String[] args)
    {
        //loop that counts up by 1 from 0 to 30 task 1
        for ( int r = 0; r <=30; r++)
        {
            System.out.printf("%3d", r);
        }
        System.out.println();
        //loop that counts down by 1 from 30 to 0 task 2
        for (int d = 30; d >=0; d --)
        {
            System.out.printf("%3d",d);
        }
        System.out.println();
        //loop that cound up by 3 from 0 to 18 task 3
        for (int c = 0; c <=18; c += 3)
        {
            System.out.printf("%3d", c);
        }
        System.out.println();
        //loop that counts down by 2 from 10 to 0 task 4
        for (int b = 10; b >= 0; b -= 2)
        {
            System.out.printf("%3d", b);
        }
        System.out.println();
        //nested loop task 5
        for (int row = 1; row <=5; row++)
        {
            for (int col = 1; col <=row; col ++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        //nested loop task 6
        for (int rowB = 5; rowB >= 1; rowB --)
        {
            for (int colB = 1; colB <= rowB; colB ++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        //nested look task 7
        for (int rowC = 5; rowC >= 1; rowC --)
        {
            for (int colC = 1; colC <= 5; colC ++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

    }
}