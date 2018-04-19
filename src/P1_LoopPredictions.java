/*
	ISYS 320
	Name(s):
	Date: 
*/

/*
 How many times do you expect the loop to repeat? Remember that 
 â€œzero,â€� â€œinfinity,â€� and â€œunknownâ€� are legal answers.
 
 What do you expect the loop to output?
 
 (a)
 Repeats: Goes up by 10 till it reaches 100
 Expected output:1 11 21 31 41 51 61 71 81 91
 (b)
 Repeats:Starting loop test and ending loop test	
 Expected output: starting loop test and ending loop test 10 times each
 (c)
 Repeats: 250
 Expected output: I believe it runs for infinity
 (d)
 Repeats:none	
 Expected output: starting loop test and ending loop test
   
 */

/*
 Was your prediction correct?
 
 (a) yes
 (b) no
 (c) yes and no, i guessed wrong on output, but new it was infinite
 (d) yes

*/
public class P1_LoopPredictions {

	public static void main(String[] args) {
		System.out.println("STARTING LOOP TEST");
		// d
		String word = "a";
		while( word.length() < 10 ) {
		    word = "b" + word + "b";
		}
				
		System.out.println("ENDING LOOP TEST");
	}

}
