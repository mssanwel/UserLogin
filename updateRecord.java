
public class updateRecord {
	public static recordType execute(recordType record) {
		String temp=Password.enter("new","user record not edited!","p");
		if (!(temp==null)) {
			record.setHashPassword(temp);
			System.out.println("Please enter your new fullname");
			record.setName(input.get());
			System.out.println("Please enter your new email address");
			record.setEmail(input.get());
			System.out.println("Record update succesfully!");
			return record;
		}	
		return null;
	}
}
