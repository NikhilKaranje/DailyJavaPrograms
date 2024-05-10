package exe_patterns_20240510;

public class Pattern02 {
    public static void main(String[] args) {

        //Patterns complex program
        // *******
        // *     *
        // *     *
        // *******

        //Declare rows and columns value
        int n = 4;
        int m = 5;

        //Outer loop
        for(int i = 1; i<= n; i++) {
            for (int j= 1; j<=m; j++){

                if (i == 1 || j ==1 || i == n || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
