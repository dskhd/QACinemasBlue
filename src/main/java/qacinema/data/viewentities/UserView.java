package qacinema.data.viewentities;

import javax.persistence.Column;

public class UserView {
	
	@Column
	String userName;
	
	@Column
	String email;
	
	@Column
	String dob;
	
	@Column 
	String line1;
	
	@Column 
	String line2;
	
	@Column 
	String town;
	
	@Column 
	String postcode;
	
	@Column 
	String county;
	
	@Column 
	String addressType;

	public String getUserName() {
		return userName;
	}

	public String getEmail() {
		return email;
	}

	public String getDob() {
		return dob;
	}

	public String getLine1() {
		return line1;
	}

	public String getLine2() {
		return line2;
	}

	public String getTown() {
		return town;
	}

	public String getPostcode() {
		return postcode;
	}

	public String getCounty() {
		return county;
	}

	public String getAddressType() {
		return addressType;
	}

}
