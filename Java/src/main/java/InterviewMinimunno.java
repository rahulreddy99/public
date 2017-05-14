
public class InterviewMinimunno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int abc[] [] = {{2,4,5},{3,-4,5},{1,2,9}};
		int min = abc[0] [0];
		int max = abc[0] [0];
		for(int i=0;i<abc.length; i++){
			for(int j=0;j<abc.length;j++){
				//System.out.println(abc[i][j]);
				
				if(abc[i][j]>max)
				{
					//min =abc[i][j];
					max = abc[i][j];
					System.out.println(max);
				}
					
			}
		}
		

	}

}
