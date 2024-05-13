
import java.util.Scanner;
import java.util.ArrayList;

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
        
        if(column1 == row2){
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
        for(int i = 0; i < matrix1.length; i++){
            for(int j = 0;j < matrix1[i].length; j++){
                System.out.print(matrix1[i][j]);
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
            //Laa
        for(int i = 0; i < matrix2.length; i++){
            for(int j = 0;j < matrix2[i].length; j++){
                System.out.print(matrix2[i][j]);
            }
            System.out.println();
        }
        }else{
            System.out.println("These matrices cannot be multiplied.");
        }
    }
    
}
