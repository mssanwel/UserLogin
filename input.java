import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class input {
	
		private static String inputLine;
		
		public static String get(){		
			// Declare BufferedReader to read from System.in
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			// Use readLine() wherever reading user input is needed to read one line of input  
			try {
				inputLine = input.readLine();
			} catch (IOException e) {  
				System.out.print("Input Error."); 
			}
			return inputLine;
		}
}
