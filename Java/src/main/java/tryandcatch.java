
public class tryandcatch {
	
	
	public static int i =2;
	public static int j=0;
	
	public void getdata(){
		
		try{
			int k=i/j;
			//tc.grtdata();
			System.out.println(k);
			
		}
		catch (Exception e){
			
			// you can have more exception catch here. Arthematicexception, Indexoutboundexception etc...
			
			System.out.println("catch the exception");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		tryandcatch tc = new tryandcatch();
		
	tc.getdata();
	
		
		//System.out.println();

	}

}
