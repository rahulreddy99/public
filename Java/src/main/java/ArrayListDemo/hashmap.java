package ArrayListDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>(); //you can use String String value
		hm.put(0, "hello");
		hm.put(2, "asf");
		hm.put(1, "value");
		hm.get(1);
		System.out.println(hm.get(1));
		Set st = hm.entrySet();  //we are keeping everything in a set then 
		Iterator i =st.iterator(); //Iterate the values from the set
		while(i.hasNext())
		{
			//System.out.println(i.next());
			Map.Entry me = (Map.Entry) i.next();         //we use this to get key and value separately
			
			System.out.println(me.getValue());
			System.out.println(me.getKey());
		}
		

	}

}
