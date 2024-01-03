import java.util.*;

class Guessgame{
    public static int game(int guess){
        Scanner sc = new Scanner (System.in);
        Random rn = new Random();
        int randInt = rn.nextInt(100);
        int count = 0;
        int attempts = 15;

        while ( attempts > 0 ){
            System.out.println("Your guess is "+guess);
            int accuracy = guess - randInt;

            if ( accuracy < 0 ){
                System.out.println("Too low");
            }
            else if ( accuracy == 0 ){
                System.out.println("You guessed it right !");
                count++;
                break;
            }
            else{
                System.out.println("Too high");
            }
            attempts--;
            
            System.out.println("Number of attempts: "+attempts);
            if ( attempts > 0 ){
                guess = sc.nextInt();
            }
        }
        return count;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        int totscore = 0;
        do{
            System.out.println("Number of attempts: 15");
            int guess = sc.nextInt();
            int score = game(guess);
            totscore += score;
            sc.nextLine();
            System.out.println("Your score :"+totscore);
            System.out.print("Want to play again? Yes or No");
        }while(sc.nextLine().equalsIgnoreCase("Yes"));
    }
}