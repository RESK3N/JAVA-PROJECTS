//rock paper scissor
import java.util.*;
public class rps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int wins=0,loss=0,total=0;
        while (true) {
            System.out.println("Enter your choice");
            System.out.println("1. For Rock\n2. For Paper\n3. For Scissors\n4. Reset Score\n5. Exit");
            int ch = sc.nextInt();
            int mac = rand.nextInt(3) + 1;
            if (mac == ch) {
                System.out.println("Tie ! Try again");
            } else {
                switch (ch) {
                    case 1:// You Chose Rock
                        if (mac == 2) {
                            System.out.println("Computer chose Paper! You Lost !");
                            loss++;
                        } else if (mac == 3) {
                            System.out.println("Computer chose Scissors! You Won !");
                            wins++;
                        }total++;
                        break;
                    case 2:// You Chose Paper
                        if (mac == 1) {
                            System.out.println("Computer chose Rock! You Won !");
                            wins++;
                        } else if (mac == 3) {
                            System.out.println("Computer chose Scissors! You Lost !");
                            loss++;
                        }total++;
                        break;
                    case 3://You Chose Scissors
                        if (mac == 1) {
                            System.out.println("Computer chose Rock! You Lost !");
                            loss++;
                        } else if (mac == 2) {
                            System.out.println("Computer chose Paper! You Won !");
                            wins++;
                        }total++;
                        break;
                    case 4:
                        wins = 0;
                        loss = 0;
                        total = 0;
                        break;
                    case 5:
                        System.out.println("Thanks for using RPS!");
                        System.exit(0);
                    default : System.out.println("Invalid choice");
                        break;
                }
            }
            System.out.println("Total= " + total + "\nWins: " + wins + "\nLoss: " + loss);
        }
    }
}
