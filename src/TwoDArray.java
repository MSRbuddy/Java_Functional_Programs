import java.util.Scanner;
import java.io.PrintWriter;
import java.io.OutputStreamWriter;

public class TwoDArray
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(System.out));

        System.out.print("Enter the number of rows (M): ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns (N): ");
        int columns = scanner.nextInt();

        int[][] array = new int[rows][columns];

        System.out.println("Enter the elements of the 2D array:");

        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println("2D Array:");

        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                printWriter.print(array[i][j] + " ");
            }
            printWriter.println();
        }

        printWriter.flush();
        printWriter.close();
        scanner.close();
    }
}