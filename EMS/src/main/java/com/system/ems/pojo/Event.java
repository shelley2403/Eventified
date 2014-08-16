package com.system.ems.pojo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Event")
public class Event implements java.io.Serializable {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

private Set<UserHasEvents> userhasevents = new HashSet<UserHasEvents>(0);

@OneToMany(fetch = FetchType.LAZY, mappedBy = "uei.event", cascade=CascadeType.ALL)
public Set<UserHasEvents> getUserhasevents() {
	return userhasevents;
}

public void setUserhasevents(Set<UserHasEvents> userhasevents) {
	this.userhasevents = userhasevents;
}
	
	
	private int eventId;
	

	private String title;
	
	
	private String eventype;
	
	
	private String description;
	
	
	private Date startDate;
	
	private Date endDate;
	
	private Date startTime;
	
	private Date endTime;
	
	private String venue;
	
	
	private String location;
	
	private int maxCapacity;
	
	private Set<TicketType> ticketType = new HashSet<TicketType>(0);
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="eventId", nullable=false)
	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	@Column(name="title", nullable=false)
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	@Column(name="description", nullable=false)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	@Column(name="startDate", nullable=false)
	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	@Column(name="endDate", nullable=false)
	public Date getEndDate() {
			return endDate;
		}

	public void setEndDate(Date endDate) {
			this.endDate = endDate;
		}
		
	
	@Column(name="startTime", nullable=false)
	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	@Column(name="endTime", nullable=false)
	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	@Column(name="venue", nullable=false)
	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	
	@Column(name="location", nullable=false)
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	@Column(name="maxCapacity", nullable=true)
	public int getMaxCapacity() {
		return maxCapacity;
	}

	public void setMaxCapacity(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}
	

	@Column(name="eventType", nullable=false)
	public String getEventype() {
		return eventype;
	}

	public void setEventype(String eventype) {
		this.eventype = eventype;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "event")
	public Set<TicketType> getTicketType() {
		return ticketType;
	}

	public void setTicketType(Set<TicketType> ticketType) {
		this.ticketType = ticketType;
	}
	
	
	
	

}
