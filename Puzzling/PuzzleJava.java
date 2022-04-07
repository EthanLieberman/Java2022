import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava {


    public ArrayList<Integer> getTenRolls(){
        
        ArrayList<Integer> rolls = new ArrayList<Integer>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++){
            rolls.add(rand.nextInt(20) + 1);
        }
        return rolls;
    }

    public char randomLetter(){

        String letters = "abcdefghijklmnopqrstuvwxyz";

        Random rand = new Random();

        char output = letters.charAt(rand.nextInt(26) + 1);

        return output;
    }

    public String randomPassword(){
        String letters = "abcdefghijklmnopqrstuvwxyz";

        Random rand = new Random();
        String output = "";

        for (int i = 0; i < 8; i++){
            output += letters.charAt(rand.nextInt(25) + 1);
        }

        return output;

    }

    public ArrayList<String> passwordSet(int size){

            ArrayList<String> options = new ArrayList<String>();

            
            for (int i = 0; i < size; i++){
                options.add(randomPassword());
            }
            return options;
    }
}