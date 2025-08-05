// Andy Ninh
// February 16th, 2025
// Rocket Ship Program

public class Main {
    public static final int SIZE = 3;

    public static void main(String[] args)
    {
        cone();
    }

    public static void cone()
    {
        for (int i = 1; i <= SIZE; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("/");
            }
            System.out.print("*");
            for (int k = 1; k <= i; k++)
            {
                System.out.print("\\");
            }
            System.out.println();
        }
    }

    public static void topHalf()
    {
        for (int i = 1; i <= SIZE; i++)
        {
            System.out.println("|");
            for (int j = 1; j <= SIZE - i; j++)
            {
                System.out.print(".");
            }
            for (int j = 1; j <= i; j++)
            {
                System.out.print("/\\");
            }
            for (int j = 1; j <= SIZE - i; j++)
            {
                System.out.print(".");
            }
        }
    }

    public static void bottomHalf()
    {

    }

}