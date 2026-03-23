import java.util.Scanner;

public class PA3 {

    public static void main(String[] args) {
        // pa3

        Scanner stdin = new Scanner(System.in);
        int test_cases = stdin.nextInt();

        for (int t = 1; t <= test_cases; t++) {
            long x = stdin.nextLong();
            long y = stdin.nextLong();
            int z = stdin.nextInt();
        }

        /*
         * 
         * need to store all the names and costs because we can't print thenm right away
         * we have to sort by cost first - if we printed as we went
         * they'd be in input order instead of sorted.
         * So have paraellel arrays just hold everything uinitl we're ready to
         * sort/print.
         * 
         * 
         */
        String[] names = new String[z];
        long[] costs = new long[z];

    }

}
