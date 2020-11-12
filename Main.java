import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    char[][] magicSquare = {
        {'P', 'R', 'E', 'Y'},
        {'L', 'A', 'V', 'A'},
        {'O', 'V', 'E', 'R'},{'T','E','N','D'}
           };
    System.out.println("Input the row you plan to check its word");
    int rowNumber = scan.nextInt();
    displayRow(magicSquare, rowNumber);
    

  }
  static void displayRow(char[][]mSquare, int row){
    System.out.printf("The word in row %d is ", row);
      for (int i = 0; i<4; i++){
         System.out.print(mSquare[row][i]);    
      }
    }  
}