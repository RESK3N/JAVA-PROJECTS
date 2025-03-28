/*create a number guessing game in java which has
1.constructor
2.takeUserInput()
3.isCorrectNumber()
 */
import java.util.*;

class Numgame{
    Scanner sc = new Scanner(System.in);
    private int num,inp,ch=0;
    private int tries;
    Numgame(){
       start();
    }
    public void start(){
        Random rand = new Random();
        num = rand.nextInt(100)+1;
        tries=0;
        takeUserInput();
    }
    public void takeUserInput(){

        System.out.println("Please enter a number between 1 and 100");
        inp = sc.nextInt();
        isCorrectNumber();
    }
    public void isCorrectNumber(){
        if(inp>num){
            System.out.println("Number entered is greater than target. Guess again.");
            tries++;
            System.out.println("Tries: "+tries+"\n");
            takeUserInput();
        }else if(inp<num){
            System.out.println("Number entered is less than target. Guess again.");
            tries++;
            System.out.println("Tries: "+tries+"\n");
            takeUserInput();
        }else{
            tries++;
            System.out.println(inp+" was a correct guess. You won in "+tries+" tries.");
            System.out.println("Play again ? 1 for yes or 0 for no.");
            ch=sc.nextInt();
            if(ch==1)
                start();
            else
                System.out.println("Thanks for playing !!! ");
        }
    }
}
public class game {
    public static void main(String[] args) {
    Numgame game = new Numgame();

    }
}
