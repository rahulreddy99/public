package SampleProject;

public class SumofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] ={1,2,3,4,5};
		int sum =0;
		int c = a.length;
		//System.out.println(a[c]);
		for(int i=0;i<a.length;i++){
			
			//System.out.println(a[i]);
			 sum = sum + a[i];
			 //System.out.println(sum);

			 if(a[i]==3){
				 //if you want to find the index
				 System.out.println(i);
				 break;// it breaks the point so it cannot go to the further numbers.
			 }
			 
			
			
		}
		 //System.out.println(sum);
		 
		
		
	}

}
