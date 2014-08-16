package com.system.ems.pojo;

import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
@Entity
@Table(name = "Friends")
public class Friends implements java.io.Serializable {
	
	    private FriendsId id;
	    private User friends;
	    private User users;
	    private int status;
	    
	    public Friends() {
	    }
	 
	    public Friends(FriendsId id, User friends,
	            User users) {
	        this.id = id;
	        this.friends = friends;
	        this.users = users;
	    }
	 
	    public Friends(FriendsId id, User friends,
	    		User users, int status) {
	        this.id = id;
	        this.friends = friends;
	        this.users = users;
	        this.status = status;
	    }
	
	    @EmbeddedId
	    @AttributeOverrides({
	            @AttributeOverride(name = "userId", column = @Column(name = "userId", nullable = false)),
	            @AttributeOverride(name = "friendId", column = @Column(name = "friendId", nullable = false)) })
	    
	public FriendsId getId() {
			return id;
		}


		public void setId(FriendsId id) {
			this.id = id;
		}

		@ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "friendId", nullable = false, insertable = false, updatable = false)
		public User getFriends() {
			return friends;
		}


		public void setFriends(User friends) {
			this.friends = friends;
		}

		 @ManyToOne(fetch = FetchType.LAZY)
		 @JoinColumn(name = "userId", nullable = false, insertable = false, updatable = false)
		public User getUsers() {
			return users;
		}


		public void setUsers(User users) {
			this.users = users;
		}


	private static final long serialVersionUID = -5277603108715882684L;
	public enum MyEnum { 
		VALUE1, VALUE2,VALUE3, VALUE4;
	} 
	
	
	@Column(name="status", nullable = false) 
	public int getStatus() { 
	    return status ;
	}
	
	
	public void setStatus(int status) {
		this.status = status;
	}


}
