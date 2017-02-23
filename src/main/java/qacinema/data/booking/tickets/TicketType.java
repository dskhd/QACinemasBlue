package qacinema.data.booking.tickets;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="ticket_types")
public class TicketType{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="typeID")
	private String typeID;
	
	@NotNull
	@Column(name="type")
	private String type;
	
	@NotNull
	@Column(name="price")
	@Size(min = 0, max=100)
	private float price;
	
	@Enumerated(EnumType.STRING)
	@Column(name="availableTo")
	private CustomerType availableTo;
	
	@Enumerated(EnumType.STRING)
	@Column(name="availableDays")
	private DaysOfWeek availableDays;
	
	@Enumerated(EnumType.STRING)
	@Column(name="availableTimes")
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