package weeklyAssign2;

public class Employee {
	String name;
	int age;
	String designation;
	
	
	Employee(String n, int a, String d){
		this.setName(n);
		this.setAge(a);
		this.setDesignation(d);
		HR_Manger hrm = new HR_Manger();
		hrm.processRecords(this.getAge(),this.getDesignation(),this.getName());
	}
	
	Employee(){
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}


}
