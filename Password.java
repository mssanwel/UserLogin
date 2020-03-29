

public class Password {
	
	public static String enter(String t, String h, String p){
		boolean pass=false;
		String password="";
		while(!pass) {
			int digitCounter=0;
			int uppercaseCounter=0;
			int lowercaseCounter=0;
			System.out.println("Please enter your " +t+ "password:");
			password=input.get();
			for (int i=0; i<password.length(); i++){
				char elem = (password.charAt(i));
				if (Character.isDigit(elem)) {
					digitCounter=digitCounter+1;
				}
				if (Character.isUpperCase(elem)) {
					uppercaseCounter=uppercaseCounter+1;
					
				}
				if (Character.isLowerCase(elem)) {
					lowercaseCounter=lowercaseCounter+1;
					
				}
			}
			//System.out.println("length " + password.length());
			//System.out.println("d"+digitCounter);
			//System.out.println("uc"+uppercaseCounter);
			//System.out.println("lc "+lowercaseCounter);
			if ((digitCounter>=1) && (uppercaseCounter>=1) && (lowercaseCounter>=1) && (password.length()>=6)){
				pass=true;
			}else {
				System.out.println("Your password has to fulfil: at least 6 characters, 1 small letter, 1 capital letter, 1 digit!");
				continue;
			}
		}
		String firstPassword=password;
		System.out.println("Please re-enter your " +t+ "password:");
		password=input.get();
		if (!(firstPassword.equals(password))) {
			System.out.println(t+p+"asswords do not match, "+h);
			return null;
		}

		return Hash.execute(password);
	}
}
