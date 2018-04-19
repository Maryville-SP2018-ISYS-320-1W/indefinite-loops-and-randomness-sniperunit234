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
 Repeats: goes up by 10
 Expected output:1 11 21 31 41 51 61 71 81 91
 (b)
 Repeats:repeat 10	
 Expected output: infinity
 (c)
 Repeats:250
 Expected output: infinity
 (d)
 Repeats:starting loop test, ending loop test
 Expected output: Starting loop test
 ab
 ending loop test
   
 */

/*
 Was your prediction correct?
 
 (a) yes
 (b) no
 (c) yes
 (d) no

*/
public class P4_DoLoopPredictions {

	public static void main(String[] args) {
		System.out.println("STARTING LOOP TEST");
		//d
		String word = "a";
		do {
		    word = "b" + word + "b";
		} while( word.length() < 10 );
		System.out.println( word );
				
		System.out.println("ENDING LOOP TEST");

	}

}
