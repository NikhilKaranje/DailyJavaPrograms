package exe_patterns_20240510;

public class Pattern04 {
    public static void main(String[] args) {

        // Patter =
        // 1
        // 12
        // 123
        // 1234


        int n = 5;

        //outer loop
        for(int i=1; i<=n; i++){
            for (int j =1 ; j<=i; j++){
                System.out.print(j + "");
            }
            System.out.println();
        }

    }
}
