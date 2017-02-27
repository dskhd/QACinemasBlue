package qacinema.data.users;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "users_have_addresses")
public class UserHaveAddresses {

	@NotNull
	@Id
	private String addressType;

	@NotNull
	@Column(name = "userEmail")
	private String userEmail;

	@NotNull
	@Column(name = "addressID")
	private String addressID;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userEmail")
	private User user;

	public UserHaveAddresses(String addressType, String userEmail, String addressID) {
		this.addressType = addressType;
		this.userEmail = userEmail;
		this.addressID = addressID;
	}


	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmails) {
		this.userEmail = userEmails;
	}

	public String getAddressID() {
		return addressID;
	}

	public void setAddressID(String addressID) {
		this.addressID = addressID;
	}

}
