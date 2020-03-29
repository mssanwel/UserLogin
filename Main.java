import java.util.*;
public class Main {

	private static ArrayList<recordType> recordList=new ArrayList<recordType>();
	private static String inputLine="";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu.display();
		while (!inputLine.equals("0")) {
			System.out.println("Please enter your command (1-3, or 0 to terminate the system):");
			
			//input here please
			inputLine=input.get();
			
			//Menu Selection
			if (inputLine.equals("1")) {
				Login.execute(recordList);
			}
			else if (inputLine.equals("2")) {
				recordType temp=addRecord.execute(recordList);
				if (!(temp==null)) {
					recordList.add(temp);
					System.out.println("Record added succesfully");
				}
			}
			else if (inputLine.equals("3")) {
				int index = Login.execute(recordList);
				recordType temp;
				if (!(index==-1)) {
					temp=updateRecord.execute(recordList.get(index));
					if (!(temp==null)) {
						recordList.set(index, temp);
					}
				}
			}
		}
	}



}
