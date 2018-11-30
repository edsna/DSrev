import java.util.Collections;
import java.util.Arrays;
public class EdsonArray{
	public static void main(String[]args){
		String str[] = {"One" , "Two" , "Three" , "Four"};	//creating & initiating array
		System.out.println("Before Sorting");
		for(String string : str){
			
			System.out.println(string);
		}
		//decreasing order
		//Arrays.sort(str);
		Arrays.sort(str, Collections.reverseOrder());
			System.out.println("After Sorting");
			for(String string : str){
			
			System.out.println(string);
		}
	}
}
