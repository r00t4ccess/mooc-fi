

public class Program {

    public static void main(String[] args) {
        int rows = 2;
        int columns = 3;
        int[][] matrix = new int[rows][columns];
        matrix[0][1] = 5;
        matrix[1][0] = 3;
        matrix[1][2] = 7;
        System.out.println(arrayAsString(matrix));
    }
    
    public static String arrayAsString(int[][] array) {
        StringBuilder bob = new StringBuilder();
        
        for (int[] i : array) {
            for ( int d : i) {
                bob.append(d);
            }
            bob.append("\n");
        }
        
        
        return bob.toString();
    }

}
