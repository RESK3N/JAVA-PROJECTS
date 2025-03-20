import java.util.*;

public class votingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> votes = new HashMap<>();

        System.out.println("Enter number of candidates:");
        int n = sc.nextInt(); sc.nextLine();

        System.out.println("Enter candidate names:");
        for (int i = 0; i < n; i++) votes.put(sc.nextLine(), 0);

        System.out.println("Enter number of voters:");
        int voters = sc.nextInt(); sc.nextLine();

        System.out.println("Cast your votes:");
        for (int i = 0; i < voters; i++) {
            String vote = sc.nextLine();
            votes.put(vote, votes.getOrDefault(vote, 0) + 1);
        }

        System.out.println("Voting Results:");
        votes.forEach((k, v) -> System.out.println(k + ": " + v + " votes"));
        sc.close();
    }
}
