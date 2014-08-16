package com.system.ems.pojo;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TicketType")
public class TicketType implements java.io.Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String ticketName;
	private int quantity;
	private int price;
	private int available;
	private TicketTypeId ticketTypeId;
	private Event event;
	
	public TicketType(){
		
	}
	
	@EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "eventId", column = @Column(name = "eventId", nullable = false)), 
            @AttributeOverride(name = "ticketName", column = @Column(name = "ticketName", nullable = false))})	
	public TicketTypeId getTicketTypeId() {
		return ticketTypeId;
	}
	public void setTicketTypeId(TicketTypeId ticketTypeId) {
		this.ticketTypeId = ticketTypeId;
	}
	
	
	@Column(name = "TicketName", nullable = false)
	public String getTicketName() {
		return ticketName;
	}

	public void setTicketName(String ticketName) {
		this.ticketName = ticketName;
	}

	

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = Event.class)
	@JoinColumn(name = "eventId", nullable = false, insertable = false, updatable = false)
	public Event getEvent() {
		return event;
	}
	
	public void setEvent(Event event) {
		this.event = event;
	}
	
	@Column(name="quantity", nullable=false)
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Column(name="price", nullable=false)
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Column(name="available", nullable=true)
	public int getAvailable() {
		return available;
	}

	public void setAvailable(int available) {
		this.available = available;
	}
	

	
	
	

}
