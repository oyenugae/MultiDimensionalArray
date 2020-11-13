import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    char[][] magicSquare = {
        {'P', 'R', 'E', 'Y'},
        {'L', 'A', 'V', 'A'},
        {'O', 'V', 'E', 'R'},
        {'T', 'E', 'N', 'D'}
           };
      
    System.out.println("Input the row you plan to check its word");
    int rowNumber = scan.nextInt();
    displayRow(magicSquare, rowNumber);
    System.out.println("Input the column you plan to check its word");
    
    int columnNumber = scan.nextInt();
    displayColumn(magicSquare, columnNumber);

    
     displayMagicSquare(magicSquare);
    

  }
  static void displayRow(char[][]mSquare, int row){
    System.out.printf("The word in row %d is ", row);
      for (int i = 0; i<4; i++){
         System.out.print(mSquare[row-1][i]);    
      }
         System.out.println("");
    } 

    static void displayColumn(char[][]mSquare, int column){
    System.out.printf("The word in column %d is ", column);
      for (int i = 0; i<4; i++){
         System.out.print(mSquare[i][column-1]);    
      }
         System.out.println("");
    } 

    static void displayMagicSquare(char[][]mSquare){
      System.out.println("");
   System.out.println("Content of the Magic Square");
      for (int i = 0; i<mSquare[0].length; i++){
        for (int j = 0; j<mSquare.length; j++){
         System.out.print(mSquare[i][j]);
        }
         System.out.println("");
      }    
      }
    
}