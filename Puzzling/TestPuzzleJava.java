import java.util.ArrayList;
import java.util.Random;
public class TestPuzzleJava {
    
	public static void main(String[] args) {
		PuzzleJava generator = new PuzzleJava();
		ArrayList<Integer> randomRolls = generator.getTenRolls();
		System.out.println(randomRolls);
		
        System.out.println(generator.randomLetter());
        System.out.println(generator.randomPassword());
        System.out.println(generator.passwordSet(5));
        
    	//..
		// Write your other test cases here.
		//..
	}
}
