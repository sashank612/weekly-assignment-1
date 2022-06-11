package weeklyAssign1;
/*WAP to create Class "SchoolRecords" create 3 data members as school name ,School ID ,School Address 
 to create records of schools in chennai,Create Method to add all records[ddRecords()] and display all records[dispRecords()]
 */

public class SchoolRecords {
	String schoolName;
	int schoolId;
	String schoolAddress;
	
	void addRecords(String N, int i, String ad) {
		schoolName = N;
		schoolId = i;
		schoolAddress = ad;
		System.out.println("The records have been added.");
	}
	
	void displayRecords() {
		System.out.printf("The school name is %s.\nThe school ID is %d."
				+ "\nThe school address is %s.",schoolName,schoolId,schoolAddress);
	}

}
