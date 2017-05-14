package Interface.Java;

public class Devloping implements BankingClient, DomainClient {
	
	//now this class is responsible to implements all the method of BankingClient

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Devloping de = new Devloping();
		de.balancetransfer();
		de.checkingbalance();
		de.paycreditcard();
		de.finalamounthow();
		System.out.println(de);
		
		BankingClient br = new Devloping(); //run time polymorphism where you can creatre a object and calling at the runtime
		br.balancetransfer();
		
		DomainClient dc = new Devloping();
		dc.accesdomain();
		System.out.println("dc");
		
		
	}	

	public void balancetransfer() {
		// TODO Auto-generated method stub
		
		System.out.println("Implemented the balancetransfer");
		
	}

	public void checkingbalance() {
		// TODO Auto-generated method stub
		System.out.println("checkingbalance");
		
	}


	public void paycreditcard() {
		// TODO Auto-generated method stub
		System.out.println("paycreditcard");
		
	}
	public void finalamounthow(){
		System.out.println("finalamountshow");
	}


	public void domainname() {
		// TODO Auto-generated method stub
		System.out.println("domanname");
		
	}


	public void accesdomain() {
		// TODO Auto-generated method stub
		
	}


	public void detailsdomain() {
		// TODO Auto-generated method stub
		
	}

}
