package Array;

public class MultidimensinalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] [] = new int [2] [2];
		a[0][0] = 1;
		a[0] [1] = 2;
		a[1] [0] =3;
		a[1] [1] = 4;
		//System.out.println(a[1] [1]);
		
		int b[] [] = {{1,2,3},{5,6,7},{4,5,6}};
		//System.out.println(b[0][2]);
		for(int i=0; i<b.length;i++){///row no.
			
			
			for(int j=0;j<b.length; j++){ //col no.
				
				System.out.println(b[i][j]);
				
			}
			
		}
		

	}

}
