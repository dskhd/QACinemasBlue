package BS.QACinema.dataLayer.booking;



/**
 * 
 * @author AlexN
 *
 */
public enum TicketType {

	ADULT(12.99f), CHILD(6.99f), STUDENT(9.99f), OAP(7.99f);
	
	private float price;
	
	private TicketType(float price){
		this.price = price;
	}
	
	public float getPrice(){
		return price;
	}
	
}