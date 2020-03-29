import java.util.*;
public class Login {
	public static int execute(ArrayList<recordType> recordList){
		String username="";
		String password="";
		boolean found=false;
			System.out.println("Please enter your username:");
			username=input.get();
			System.out.println("please enter your password:");
			password=input.get();
			for (int x=0; x<recordList.size(); x++) {
				if (recordList.get(x).getUserName().contentEquals(username)) {
					found =true;
					if (recordList.get(x).getFailedLogin()<3) {
						if (recordList.get(x).getHashPassword().contentEquals(Hash.execute(password))) {
							System.out.println("Login success! Hello "+recordList.get(x).getUserName()+"!");
							recordList.get(x).setFailedLogin(0);
							return x;
						}else {
							System.out.println("Login failed!");
							recordList.get(x).setFailedLogin(recordList.get(x).getFailedLogin()+1);
							return -1;
						}
					}else {
						System.out.println("Login failed! Your account has been locked!");
						return -1;
					}
				}
			}
			if (!found) {
				System.out.println("User not found!");
				return -1;
			}
			return -1;
	}
}
