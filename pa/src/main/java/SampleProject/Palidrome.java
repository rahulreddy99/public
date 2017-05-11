package SampleProject;

public class Palidrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "qwertyu";
		String st = "";
		
		/*for(int i=0; i< s.length()-1;i--){
			System.out.println(s.charAt(i));
			//System.out.println(str);
		}*/
		
		for(int j=s.length()-1; j>=0; j--){
			
			//character value is for the index value. 
			
			//System.out.println(s.charAt(j));
			 st = st + s.charAt(j);
			
			
		}
		System.out.println(st);
		if(s==st){
			System.out.println("Matched");
			
		}


	}

}
