/* 3. Write a program to perform following operations on an array
  B. Find Transpose of a 3x3 matrix */
 
  public class matrix {
      public static void main(String[] args) {
          int[][] matrix = {{1, 5, 7}, {6, 8, 9}, {3, 5, 2}};
  
          System.out.println("Original Matrix:");
          printMatrix(matrix);
  
          int[][] transpose = new int[3][3];
          for (int i = 0; i < 3; i++) {
              for (int j = 0; j < 3; j++) {
                  transpose[i][j] = matrix[j][i];
              }
          }
  
          System.out.println("Transpose Matrix:");
          printMatrix(transpose);
      }
      public static void printMatrix(int[][] matrix) {
          for (int i = 0; i < matrix.length; i++) {
              for (int j = 0; j < matrix[0].length; j++) {
                  System.out.print(matrix[i][j] + " ");
              }
              System.out.println();
          }
      }
  }