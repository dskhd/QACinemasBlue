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
	@Column(name = "userEmails")
	private String userEmails;

	@NotNull
	@Column(name = "addressIDs")
	private String addressIDs;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userEmails")
	private User user;

	public UserHaveAddresses(String addressType, String userEmails, String addressIDs) {
		this.addressType = addressType;
		this.userEmails = userEmails;
		this.addressIDs = addressIDs;
	}

}
