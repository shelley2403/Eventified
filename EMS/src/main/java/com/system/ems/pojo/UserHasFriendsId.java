package com.system.ems.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class UserHasFriendsId implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1080229696478217656L;
	
	private Integer userId;
	private String friendId;
	
	@ManyToOne
	@JoinColumn(name="userId")
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFriendId() {
		return friendId;
	}

	public void setFriendId(String friendId) {
		this.friendId = friendId;
	}
	
	
	public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserHasFriendsId that = (UserHasFriendsId) o;

        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (friendId != null ? !friendId.equals(that.friendId) : that.friendId != null)
            return false;

        return true;
    }

    public int hashCode() {
        int result;
        result = (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (friendId != null ? friendId.hashCode() : 0);
        return result;
    }

}
