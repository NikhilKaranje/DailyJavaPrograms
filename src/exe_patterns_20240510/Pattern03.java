package exe_patterns_20240510;

public class Pattern03 {
    public static void main(String[] args) {

        //Pattern program
        // *
        // **
        // ***
        // ****

        int n = 4;
        //Outer loop
        // for(int i = 1; i<= n ; i++)
        for (int i=n ; i>= 1; i--){

            //inner loop
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
