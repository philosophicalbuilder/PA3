import java.util.ArrayList;
import java.util.HashMap;
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

            // using Hmap instead
            HashMap<String, Long> map = new HashMap<>();

            for (int i = 0; i < z; i++) {
                long removeCost = stdin.nextLong();
                long halveCost = stdin.nextLong();

                int numHalves = 0;
                long val = x;

                while (val / 2 >= y) {
                    long killed = val - val / 2;
                    if (halveCost <= killed * removeCost) {
                        numHalves++;
                        val = val / 2;
                    } else {
                        break;
                    }
                }
                // total cost = halving costs + cost to remove the rest one by one
                long cost = (long) numHalves * halveCost + (val - y) * removeCost;

            }

            ArrayList<String> names = new ArrayList<>();
            names.sort((a, b) -> {
                if (a.cost != b.cost) {
                    return Long.compare(a.cost, b.cost);
                } else {
                    return a.name.compareTo(b.name);
                }
            });

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

            // for each company:
            // 1. read in the name, remove cost, and halve cost
            // 2. start at x zombies
            // 3. keep halving as long as we stay above y
            // - if halving is cheaper than removing that many one by one, halve
            // - otherwise stop halving
            // 4. cost = (number of halves * halve cost) + (remaining zombies * remove cost)
            // // is remaining zombies right?
            // it should be (val - y) not just val, we only need to remove down to y

        }

    }

}
