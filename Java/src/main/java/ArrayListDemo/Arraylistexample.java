package ArrayListDemo;

import java.util.ArrayList;

public class Arraylistexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ArrayList<String> as = new ArrayList<String>();
		as.add("Rahul");
		as.add("rafr");
		as.add(1, "quick");
		//as.remove(2);
		as.get(0);
		System.out.println(as.get(0));
		System.out.println(as.contains("rafr"));
		System.out.println(as.indexOf("Rahul"));
		

	}

}
