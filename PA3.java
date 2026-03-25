import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class PA3 {

    public static void main(String[] args) {

        Scanner stdin = new Scanner(System.in);
        int test_cases = stdin.nextInt();

        for (int t = 1; t <= test_cases; t++) {
            long x = stdin.nextLong();
            long y = stdin.nextLong();
            int z = stdin.nextInt();

            HashMap<String, Long> map = new HashMap<>();

            for (int i = 0; i < z; i++) {
                String name = stdin.next();
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
                map.put(name, cost);
            }

            ArrayList<String> companies = new ArrayList<>(map.keySet());
            companies.sort((a, b) -> {
                long costA = map.get(a);
                long costB = map.get(b);
                if (costA != costB) {
                    return Long.compare(costA, costB);
                }
                return a.compareTo(b);
            });

            System.out.println("Case " + t);
            for (String name : companies) {
                System.out.println(name + map.get(name));
            }

        }

    }

}
