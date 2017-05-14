package Superclass;

public class ChildDemo  extends ParentDemo {
	
	String name ="rrr";
	
	private void syso() {
		// TODO Auto-generated method stub

		System.out.println(name);
		System.out.println(super.name);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildDemo cd = new ChildDemo();
		cd.syso();

	}

}
