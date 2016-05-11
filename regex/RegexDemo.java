import java.util.*;
public class RegexDemo{
	public static void main(String args[]){
		
		Utility utility=new Utility();
		UserDetails userDetails=new UserDetails();

		System.out.println("Enter FirstName:");
		userDetails.setfName(utility.inputWord());
		
		System.out.println("Enter LastName:");
		userDetails.setlName(utility.inputWord());

		System.out.println("Enter MobileNumber:");
		userDetails.setmobileNo(utility.inputWord());
		
		//Setting Currrent date
		userDetails.setdate(utility.getFormatedDate(new Date()));

		System.out.println(utility.convertString(userDetails,utility.getFileText("file.txt")));

		
	}

}
