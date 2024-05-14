
import java.util.Scanner;

/*
* Backburner: 
*   Format matrices...
*/

public class MatrixProject {

    public static void main(String[] args) {
        int row1 = 0;
        int column1 = 0;
        int row2 = 0;
        int column2 = 0;
        Scanner input = new Scanner(System.in);
        
        //TAKES IN ROWS AND THEN COLUMNS FOR MATRIX 1
        System.out.print("How many rows are in your first matrix? ");
        row1 = input.nextInt();
        System.out.print("How many columns are in your first matrix? ");
        column1 = input.nextInt();
        
        //TAKES IN ROWS AND THEN COLUMNS FOR MATRIX 2
        System.out.print("How many rows are in your second matrix? ");
        row2 = input.nextInt();
        System.out.print("How many columns are in your second matrix? ");
        column2 = input.nextInt();
        
        while(column1 != row2){
                System.out.println("These matrices cannot be multiplied. Re-enter another matrix: ");

                //TAKES IN ROWS AND THEN COLUMNS FOR MATRIX 1
                System.out.print("How many rows are in your first matrix? ");
                row1 = input.nextInt();
                System.out.print("How many columns are in your first matrix? ");
                column1 = input.nextInt();

                //TAKES IN ROWS AND THEN COLUMNS FOR MATRIX 2
                System.out.print("How many rows are in your second matrix? ");
                row2 = input.nextInt();
                System.out.print("How many columns are in your second matrix? ");
                column2 = input.nextInt();                
            }

        int[][] matrix1 = new int[row1][column1];
        int[][] matrix2 = new int[row2][column2];
        
        System.out.println();
        
        //THIS ENTIRE SECTION TAKES IN VALUES FOR MATRIX 1
        int rowcounterforstring = 1;
        int columncounterforstring = 1;
        for(int i = 0; i < matrix1.length; i++){
            for(int j = 0;j < matrix1[i].length; j++){
                System.out.print("Enter the value in row "+rowcounterforstring+" and column "+columncounterforstring+" for the first matrix: ");
                matrix1[i][j] = input.nextInt();
                columncounterforstring++;
            }
            columncounterforstring=1;
            rowcounterforstring++;
        }
        
        System.out.println();
        
        //THIS SECTION PRINTS MATRIX 1
        System.out.println("Matrix 1: ");
        for(int r = 0; r < matrix1.length; r++){
            for(int c = 0; c < matrix1[r].length; c++){
                if(c==0)
                    System.out.print("[ ");
                System.out.print(matrix1[r][c]);
                if(c!=matrix1[r].length-1){
                    System.out.print(", ");
                }
                if(c==matrix1[r].length-1)
                    System.out.print(" ]");
            }
            System.out.println();
        }


        System.out.println();
        
        //THIS ENTIRE SECTION TAKES IN VALUES FOR MATRIX 2
        rowcounterforstring = 1;
        columncounterforstring = 1;
        for(int i = 0; i < matrix2.length; i++){
            for(int j = 0;j < matrix2[i].length; j++){
                System.out.print("Enter the value in row "+rowcounterforstring+" and column "+columncounterforstring+" for the second matrix: ");
                matrix2[i][j] = input.nextInt();
                columncounterforstring++;
            }
            columncounterforstring=1;
            rowcounterforstring++;
        }
        
        System.out.println();
        
        //THIS SECTION PRINTS MATRIX 2
        System.out.println("Matrix 2: ");
        for(int r = 0; r < matrix2.length; r++){
            for(int c = 0; c < matrix2[r].length; c++){
                if(c==0)
                    System.out.print("[ ");
                System.out.print(matrix2[r][c]);
                if(c!=matrix2[r].length-1){
                    System.out.print(", ");
                }
                if(c==matrix2[r].length-1)
                    System.out.print(" ]");
            }
            System.out.println();
        }
        System.out.println();

        //THIS SECTION CREATES THE PRODUCT MATRIX AND PRINTS IT
        int[][] product = MatrixMultiplier(matrix1,matrix2);
        
        System.out.println("Product Matrix: ");
        for(int r = 0; r < product.length; r++){
            for(int c = 0; c < product[r].length; c++){
                if(c==0)
                    System.out.print("[ ");
                System.out.print(product[r][c]);
                if(c!=product[r].length-1){
                    System.out.print(", ");
                }
                if(c==product[r].length-1)
                    System.out.print(" ]");
            }
            System.out.println();
        }
            
        input.close();
    }

    public static int[][] MatrixMultiplier(int[][] matrix1, int[][] matrix2){
        int[][] product = new int[matrix1.length][matrix2[0].length];
         for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for (int k = 0; k < matrix1.length; k++) {
                    product[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return product;
    }
    
}