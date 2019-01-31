import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        System.out.println("Enter the number to look for prime numbers: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int j = (number/10)+1;
        System.out.println("Prime numbers: ");
        int[][] matrix = new int[j][10];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (row == 0  && col == 0) {
                    matrix[row][col] = 0;
                } else {
                    matrix[row][col] = col + 1 + (row*10);
                    for (int i = 2; i <= matrix[row][col]; i++) {
                        if(matrix[row][col]%i==0 && matrix[row][col]>i) {
                            i = matrix[row][col] + 1;
                        }
                        else if (matrix[row][col]%i==0 && matrix[row][col]==i){
                            if (matrix[row][col]<=number)
                            System.out.print(matrix[row][col]+", ");
                        }
                    }
                }
            }
        }
    }
}
