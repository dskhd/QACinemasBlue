package qacinema.data.viewentities;

public class UserViewId {

	private String email;
	private String addressType;
 
    public UserViewId(){
        // Your class must have a no-arq constructor
    }
 
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof UserViewId){
        	UserViewId id = (UserViewId) obj;
 
            if(!id.getEmail().equals(email)){
                return false;
            }
            if(!id.getAddressType().equals(addressType)){
                return false;
            }
            return true;
        }
        return false;
    }

    
    
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
	
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
 
}
