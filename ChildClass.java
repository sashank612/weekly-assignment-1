package weeklyAssign2;

public class ChildClass extends AbstractClass{
	static int si = 200;
	
	@Override
	void abstractMethod() {
		System.out.printf("The Final int is: %d\n",super.fi );
		System.out.printf("The Static int is %d",si);
		
	}
}
