package com.system.ems.pojo;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;



@Entity
@Table(name = "user_has_event")
@AssociationOverrides({
		@AssociationOverride(name = "uei.user", joinColumns = @JoinColumn(name = "userId")),
		@AssociationOverride(name = "uei.event", joinColumns = @JoinColumn(name = "eventId")) })
public class UserHasEvents implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UserhasEventsId uei = new UserhasEventsId();
	private String userRole;

	public UserHasEvents() {
	}

	@EmbeddedId
	public UserhasEventsId getUei() {
		return uei;
	}

	public void setUei(UserhasEventsId uei) {
		this.uei = uei;
	}

	@Transient
	public User getUser() {
		return getUei().getUser();
	}

	

	public void setUser(User user) {
		getUei().setUser(user);
	}

	@Transient
	public Event getEvent() {
		return getUei().getEvent();
	}

	public void setEvent(Event event) {
		getUei().setEvent(event);
	}

	
	@Column(name = "userRole", nullable = false)
	
	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	

	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		UserHasEvents that = (UserHasEvents) o;

		if (getUei() != null ? !getUei().equals(that.getUei())
				: that.getUei() != null)
			return false;

		return true;
	}



	public int hashCode() {
		return (getUei() != null ? getUei().hashCode() : 0);
	}
}
