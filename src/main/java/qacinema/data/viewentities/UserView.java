package qacinema.data.viewentities;

import javax.persistence.Column;

public class UserView {
	
	@Column
	private String userName;
	
	@Column
	private String email;
	
	@Column
	private String dob;
	
	@Column 
	private String line1;
	
	@Column 
	private String line2;
	
	@Column 
	private String town;
	
	@Column 
	private String postcode;
	
	@Column 
	private String county;
	
	@Column 
	private String addressType;

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
