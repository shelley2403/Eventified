package com.system.ems.pojo;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TicketTypeId implements java.io.Serializable {

	private static final long serialVersionUID = 2013458641430189581L;
	private String ticketName;
	private Integer eventId;
	
	public TicketTypeId(){
	}
	
	public TicketTypeId(String ticketName,int eventId){
		this.ticketName=ticketName;
		this.eventId=eventId;
	}

	@Column(name = "ticketName", nullable = false)
	public String getTicketName() {
		return ticketName;
	}

	public void setTicketName(String ticketName) {
		this.ticketName = ticketName;
	}

	
	@Column(name = "eventId", nullable = false)
	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
    
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TicketTypeId that = (TicketTypeId) o;

        if (ticketName != null ? !ticketName.equals(that.ticketName) : that.ticketName != null) return false;
        if (eventId != null ? !eventId.equals(that.eventId) : that.eventId != null)
            return false;

        return true;
    }

    public int hashCode() {
        int result;
        result = (ticketName != null ? ticketName.hashCode() : 0);
        result = 31 * result + (eventId != null ? eventId.hashCode() : 0);
        return result;
    }
	
}