import java.sql.SQLOutput;

public class CheckForSeats {
    private static int [][]matrixOfSeats = new int[10][6];
    public static int[][] getMatrixOfSeats() {
        return matrixOfSeats;
    }
    public static void setMatrixOfSeats(int[][] matrixOfSeats) {
        CheckForSeats.matrixOfSeats = matrixOfSeats;
    }
    public static void takeSeats(String string){
        String stringWithoutSpaces = string.trim();
        for (int i = 0; i <stringWithoutSpaces.length() ; i+=2) {
            int column = stringWithoutSpaces.charAt(i)-65;
            int row = Integer.parseInt(stringWithoutSpaces.substring(i+1,i+2))-1;
            matrixOfSeats[row][column] = 1;
        }
    }
    public static void checkForFreeSeats(){
        for (int i = 0; i < matrixOfSeats.length; i++) {
            System.out.print("Free pairs of seat in row " + (int)(i+1) + " " + "are  ");
            for (int j = 0; j <matrixOfSeats[i].length ; j+=3) {
                if((matrixOfSeats[i][j]|matrixOfSeats[i][j+1])==0)
                {
                    System.out.print((char)(j+65) + " " + (int)(i + 1) + " ");
                    System.out.print((char)(j+1+65) + " " + (int)(i + 1) + " ");
                    System.out.print("  ");
                }
                if((matrixOfSeats[i][j]|matrixOfSeats[i][j+2])==0) {
                    System.out.print((char)(j + 65) + " " + (int) (i + 1) + " ");
                    System.out.print((char)(j+2+65) + " " + (int)(i + 1) + " ");
                    System.out.print("  ");
                }
                if((matrixOfSeats[i][j+1]|matrixOfSeats[i][j+2])==0){
                    System.out.print((char)(j+1+65) + " " + (int)(i + 1) + " ");
                    System.out.print((char)(j+2+65) + " " + (int)(i + 1) + " ");
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
    public static void printMatrix(int [][]matrix){
        for (int i = 0; i <matrix.length ; i++) {

            for (int j = 0; j <matrix[i].length ; j++) {
                if(j==3) System.out.print("\t");
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int [][]matrixOfSeats = new int[10][7];
        String string = new String("A1B4C3D6");
        takeSeats(string);
        printMatrix(getMatrixOfSeats());
        checkForFreeSeats();
    }

}
