package SampleProject;

public class Grandson extends Son {
	//because it inheritated from son(which has gransfather in it so be able to make sure of those methods)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Grandson gs = new Grandson();
		gs.city();
		gs.cityactivited();
		System.out.println(gs);

	}

}
