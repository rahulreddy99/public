package Superclass;

public class thiskeyword {
	
	int a =5;

	public void adddata() {
		// TODO Auto-generated method stub
		
		int a =3;
		int c;
		System.out.println(a);
		System.out.println(this.a);//this can be used in the object class level
		c= a + this.a;
		System.out.println(c);
		

	}
	public static void main(String[] args) {
		thiskeyword ts = new thiskeyword();
		ts.adddata();

}
}

