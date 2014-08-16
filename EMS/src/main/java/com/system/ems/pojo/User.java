package com.system.ems.pojo;

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
@Table(name="User")
public class User implements java.io.Serializable  {
	
	/**
	 * 
	 */
	
	private int userId;
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String phoneNo;
	private String address;
	private String email;
	private String uniqueNo;

	
	public User(){}
	public User(int userId, String username, String password, String firstName, String lastName, String phoneNo, String address, String email) {
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNo = phoneNo;
		this.address = address;
		this.address = address;
		this.email = email;
	}
	
	
	
	public User(String firstName, int userId) {
		this.userId = userId;
		this.firstName = firstName;
	}

	public User(String firstName, int userId, Set<UserHasEvents> userhasevents) {
		this.userId = userId;
		this.firstName = firstName;
		this.userhasevents = userhasevents;
	}
	
	
	private static final long serialVersionUID = 1L;


	private Set<UserHasEvents> userhasevents = new HashSet<UserHasEvents>(0);
	
	private Set<Friends> friends = new HashSet<Friends>(0);
    private Set<Friends> users = new HashSet<Friends>(0);
    private Set<Notification> notification;
    
    
	
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "friends")
	public Set<Friends> getFriends() {
		return friends;
	}
    public void setFriends(Set<Friends> friends) {
		this.friends = friends;
	}
    
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "users")
	public Set<Notification> getNotification() {
		return notification;
	}
	public void setNotification(Set<Notification> notification) {
		this.notification = notification;
	}
	
	
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "users")
	public Set<Friends> getUsers() {
		return users;
	}
	public void setUsers(Set<Friends> users) {
		this.users = users;
	}
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "uei.user", cascade=CascadeType.ALL)
	public Set<UserHasEvents> getUserhasevents() {
		return userhasevents;
	}

	public void setUserhasevents(Set<UserHasEvents> userhasevents) {
		this.userhasevents = userhasevents;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="userId", nullable=false)
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	
	@Column(name="uniqueNo", nullable=false, unique=true)
	public String getUniqueNo() {
		return uniqueNo;
	}
	public void setUniqueNo(String uniqueNo) {
		this.uniqueNo = uniqueNo;
	}
	
	@Column(name="username", nullable=false)
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	@Column(name="password", nullable=false)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	@Column(name="firstName", nullable=false)
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	@Column(name="lastName", nullable=false)
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Column(name="phoneNo", nullable=true)
	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	@Column(name="address", nullable=true)
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	@Column(name="email", nullable=false)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
