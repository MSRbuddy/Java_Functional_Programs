import java.util.Scanner;

public class WindChill
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        if (args.length < 2)
        {
            System.out.println("Please provide two values : t and v.");
        }

        double t = sc.nextDouble();
        double v = sc.nextDouble();

        if (isValidInput(t, v))
        {
            double windChill = calculateWindChill(t, v);
            System.out.println("Wind Chill: " + windChill);
        }
        else
        {
            System.out.println("Invalid input! Please ensure t is within -50 to 50 and v is within 3 to 120.");
        }
    }

    public static boolean isValidInput(double t, double v)
    {
        return Math.abs(t) <= 50 && v >= 3 && v <= 120;
    }

    public static double calculateWindChill(double t, double v)
    {
        double windChill = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
        return windChill;
    }
}