import java.util.Scanner;
/*
* Backburner: 
*   Format matrices...
* 
*/
public class MatrixProject {
    public static void main(String[] args) {
        int row1 = 0;
        int column1 = 0;
        int row2 = 0;
        int column2 = 0;
        Scanner input = new Scanner(System.in);
        
        //Ask if matrix addition and multiplcation:
        System.out.println("Would you like to add matrices or multiply them.");
        System.out.println("Type 1 for Multiplcation or Type 2 for Addition");
        int addOrMul = input.nextInt();

        //Checker to ensure 1 or 2 has been entered
        while (addOrMul != 1 && addOrMul !=2 ){
            System.out.println("We can only add or multiply...");
            System.out.println("Type 1 for Multiplcation or Type 2 for Addition");
            addOrMul = input.nextInt();
        }

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
        
        //For matrix multiplcation check and ask if to instead add
        if(addOrMul == 1){
            while(column1 != row2){
                System.out.println("These matrices cannot be multiplied. Re-enter another matrices: ");

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
        } 
        //for matrix multiplcation: ensures that we can add and also asks to multiply instead
        if(addOrMul == 2){
            while(column1 != column2 || row1 != row2){
                System.out.println("These matrices cannot be added. Re-type other matrices: ");

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
        }

        double[][] matrix1 = new double[row1][column1];
        double[][] matrix2 = new double[row2][column2];
        
        System.out.println();

        //THIS ENTIRE SECTION TAKES IN VALUES FOR MATRIX 1
        for(int r = 0; r < matrix1.length; r++){
            for(int c = 0;c < matrix1[r].length; c++){
                System.out.print("Enter the value in row "+(r+1)+" and column "+(c+1)+" for the first matrix: ");
                matrix1[r][c] = input.nextDouble();
            }
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
        for(int r = 0; r < matrix2.length; r++){
            for(int c = 0;c < matrix2[r].length; c++){
                System.out.print("Enter the value in row "+(r+1)+" and column "+(c+1)+" for the second matrix: ");
                matrix2[r][c] = input.nextDouble();
            }
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

        //THIS SECTION CREATES THE PRODUCT/SUM MATRIX AND PRINTS IT

        if(addOrMul == 1) {
            double [][]product = MatrixMultiplier(matrix1, matrix2);
            
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
        }

        if(addOrMul == 2){
            double[][] sum = MatrixAddition(matrix1,matrix2);

            System.out.println("Sum Matrix: ");
            for(int r = 0; r < sum.length; r++){
                for(int c = 0; c < sum[r].length; c++){
                    if(c==0)
                        System.out.print("[ ");
                    System.out.print(sum[r][c]);
                    if(c!=sum[r].length-1){
                        System.out.print(", ");
                    }
                    if(c==sum[r].length-1)
                        System.out.print(" ]");
                }
                System.out.println();
            }     
        } 

        input.close();
    }

    public static double[][] MatrixMultiplier(double[][] matrix1, double[][] matrix2){
        double[][] product = new double[matrix1.length][matrix2[0].length];
         
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j <matrix2[0].length; j++) {
                product[i][j]=0;
                for (int k = 0; k < matrix1[0].length; k++) {
                    product[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return product;
    }

    //I have not tested to see if this works
    public static double[][] MatrixAddition(double[][] matrix1, double[][] matrix2){ 
        double[][] sum = new double[matrix1.length][matrix2[0].length];

        for(int row = 0; row < matrix1.length; row++){
            for(int col = 0; col < matrix2[0].length; col++){
                sum[row][col] += matrix1[row][col] + matrix2[row][col];
            }
        }
        return sum;
    }
    
}