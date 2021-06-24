package Practice;

class EncapAccount {
	
private String bankname;
private String bankbranchname;
private long acc_no;
private String name;
private String email;
private float amount;

//Getter
public String getBankName() {
	return bankname;
}
public String getBankBranchName() {
	return bankbranchname;
}
public long getAcc_no() {
	return acc_no;
}
public String getName()	{
	return name;
}
public String getEmail() {
	return email;
}
public float getAmount() {
	return amount;
}
//Setter
public void setBanName(String bankname) {
	this.bankname = bankname;
}
public void setBankBranchName(String bankbranchname) {
	this.bankbranchname = bankbranchname;
}
public void setAcc_no(long acc_no) {
	this.acc_no = acc_no;
}
public void setName(String name) {
	this.name = name;
}
public void setEmail(String email) {
	this.email = email;
}
public void setAmount(float amount) {
	this.amount = amount;
}

}
