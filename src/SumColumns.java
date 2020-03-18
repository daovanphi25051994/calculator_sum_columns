import java.util.Scanner;

public class SumColumns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter rows of array : ");
        int x = scanner.nextInt();
        System.out.printf("Enter columns of array : ");
        int y = scanner.nextInt();
        if (x > 0 && y > 0) {
            double[][] arrNumbers = new double[x][y];
            for (int i = 0; i < arrNumbers.length; i++) {
                for (int j = 0; j < arrNumbers[i].length; j++) {
                    System.out.printf("arr[%d][%d] = ", i, j);
                    arrNumbers[i][j] = scanner.nextDouble();
                }
            }
            System.out.printf("what column do you calculator sum : ");
            int columns = scanner.nextInt();
            double sum = 0;
            for (int i = 0; i < arrNumbers.length; i++) {
                sum += arrNumbers[i][columns];
            }
            System.out.printf("sum = %.2f", sum);

        } else {
            System.out.printf("Invalid input !!");
        }
    }
}
