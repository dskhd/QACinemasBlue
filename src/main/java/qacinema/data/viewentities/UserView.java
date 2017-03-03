package qacinema.data.viewentities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.IdClass;

import org.hibernate.annotations.Immutable;

@Entity 
@IdClass(value=UserViewId.class)
@Immutable
@Table(name = "userView")
public class UserView {

	
	
	@Id
	private String email;
	
	@Id
	private String addressType;
	
	@Column
	private String userName;
	
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
