package Practice;

public class TestAccountEncap {

	public static void main(String[] args) {
		// Creating instance of Account class
		EncapAccount acc = new EncapAccount();
		
		//setting vales through setter methods
		acc.setBanName("Bank of America");
		acc.setBankBranchName("Addision");
		acc.setAcc_no(7560504000L);
		acc.setName("Syed Ali");
		acc.setEmail("syedali@gmail.com");
		acc.setAmount(500000f);
		
		
		//getting and Displaying vales through getter methods
		System.out.println("Account Holder Bank Name       : " +acc.getBankName());
		System.out.println("Account Holder Bank Branch Name: " +acc.getBankBranchName());
		System.out.println("Account Holder Number          : " + acc.getAcc_no());
		System.out.println("Account Holder Name            : " + acc.getName());
		System.out.println("Account Holder Email           : " + acc.getEmail());
		System.out.println("Account Holder Amount          : " + acc.getAmount());
		
		

	}

}
