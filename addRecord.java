import java.util.ArrayList;

public class addRecord {
	public static recordType execute(ArrayList<recordType> recordList){
		String username;
		recordType record = new recordType();
		System.out.println("Please enter your username");
		username=input.get();
		for (int x=0; x<recordList.size(); x++) {
			if (recordList.get(x).getUserName().contentEquals(username)) {
				System.out.println("The username is already taken!");
				return null;
			}
		}
		record.setUserName(username);
		String temp=Password.enter("","no user added!","P");
		if (!(temp==null)) {
			record.setHashPassword(temp);
			System.out.println("Please enter your fullname");
			record.setName(input.get());
			System.out.println("Please enter your email address");
			record.setEmail(input.get());
			System.out.println("Please enter your phone number");
			record.setPhone(input.get());
			return record;
		}
		return null;
	}
}
