package reverseSentence;
//import java.awt.*;
//import java.util.*;
import java.util.Scanner; 

public class RevereseSentence {
	
	public static void reverseSentence(String Sentence){
		
		//our string needed for the task
		String regSent =Sentence;							//incoming sentence
		String[] arrSent = regSent.split("\\s+");			//the sentence in array (forwards)
		String[] revSent = new String[arrSent.length];		//the reverse sentence array
		
		
		//loop to fill sentence in array
		for (int i = 0; i < arrSent.length; i++) {
		    // You may want to check for a non-word character before blindly
		    // performing a replacement
		    // It may also be necessary to adjust the character class
		    arrSent[i] = arrSent[i].replaceAll("[^\\w]", "");
		}
		
		
		/*
		
		//test to see the array working spaced out with "---"
		for( int j = 0; j < arrSent.length; j++ ){
			
			System.out.print(arrSent[j]+"---");
		}
		
		*/
		
		//new line
			System.out.println("");
		
		//test print array position backwards
		/*
		 * for( int back = arrSent.length; back > 0; back-- ){
		 * System.out.print(back);
			}
		 *
		 */
			
		//now to add the sentence in reverse into revSent
		System.out.println("");
		int y =0;						//y is beginning of revSent
		
		for( int back = arrSent.length; back > 0; back-- ){
			
			System.out.print(arrSent[back-1] + " ");			//prints sentence in reverse
			revSent[y]=arrSent[back-1];							//saves sentence in reverse
			y++;
		}
		
		System.out.println("");
		System.out.println("");
		
		//now to print word by word reverse
		for(int i =0; i < arrSent.length; i++){
			
			int z =arrSent.length;
			for(int j = 0; j <= i; j++){
				System.out.print(revSent[j]+ "  ");
				z--;
			}
			
			for(int j = 0; j <= z-1; j++){
				System.out.print(arrSent[j]+ "  ");
			}
		
			
			System.out.println("");
			
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//next get info from user
				System.out.println("Type a sentence to be reversed:");
				Scanner reader = new Scanner(System.in);
				String reverseThis = reader.nextLine();
			
				
		reverseSentence(reverseThis);
		reader.close();

	}

}
