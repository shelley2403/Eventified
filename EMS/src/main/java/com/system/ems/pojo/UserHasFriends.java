package com.system.ems.pojo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "User_has_Friends")
public class UserHasFriends implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 134523958247223792L;
	private String requestStatus;
	private int serialNo;
	private User user;
	private String friendId;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "serialNo", nullable = false)
	public int getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}
	
	
	
	@ManyToOne
	@JoinColumn(name="userId")
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}


	@Column(name = "friendId", nullable = false, unique=true)
	public String getFriendId() {
		return friendId;
	}
	
	

	public void setFriendId(String friendId) {
		this.friendId = friendId;
	}
	

	
	
	@Column(name = "requestStatus", nullable = false)
	public String getRequestStatus() {
		return requestStatus;
	}
	public void setRequestStatus(String requestStatus) {
		this.requestStatus = requestStatus;
	}

}
