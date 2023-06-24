import java.util.Scanner;

public class Distance
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        if (args.length < 2)
        {
            System.out.println("Please provide two integer values : x and y.");
        }
        System.out.println("Enter the value of X : ");
        int x = sc.nextInt();
        System.out.println("Enter the value of Y : ");
        int y = sc.nextInt();

        double distance = calculateDistance(x, y);
        System.out.println("Distance from (" + x + ", " + y + ") to the origin (0, 0): " + distance);
    }

    public static double calculateDistance(int x, int y) {
        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        return distance;
    }
}