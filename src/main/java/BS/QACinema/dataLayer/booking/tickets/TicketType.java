package BS.QACinema.dataLayer.booking.tickets;

public class TicketType{
	
	private String type;
	private float price;
	
	private CustomerType availableTo;
	private DaysOfWeek availableDays;
	
	private TimesOfDay availableTimes;
	
	
	public TicketType(String name, float price, CustomerType availableTo, DaysOfWeek availableDays, TimesOfDay availableTimes){
		this.type = name;
		this.availableTo = availableTo;
		this.price = price;
		this.availableDays = availableDays;
		this.availableTimes = availableTimes;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}


	public CustomerType getAvailableTo() {
		return availableTo;
	}


	public void setAvailableTo(CustomerType availableTo) {
		this.availableTo = availableTo;
	}


	public DaysOfWeek getAvailableDays() {
		return availableDays;
	}


	public void setAvailableDays(DaysOfWeek availableDays) {
		this.availableDays = availableDays;
	}


	public TimesOfDay getAvailableTimes() {
		return availableTimes;
	}


	public void setAvailableTimes(TimesOfDay availableTimes) {
		this.availableTimes = availableTimes;
	}
	
	
	
}