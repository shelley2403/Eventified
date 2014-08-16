package com.system.ems.pojo;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class FriendsId implements java.io.Serializable {
 
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private int userId;
    private int friendId;
 
    public FriendsId() {
    }
 
    public FriendsId(int userId, int friendId) {
        this.userId = userId;
        this.friendId = friendId;
    }
 
    @Column(name = "userId", nullable = false)
    public int getUserId() {
        return this.userId;
    }
 
    public void setUserId(int userId) {
        this.userId = userId;
    }
 
    @Column(name = "friendId", nullable = false)
    public int getFriendId() {
        return this.friendId;
    }
 
    public void setFriendId(int friendId) {
        this.friendId = friendId;
    }
 
    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof FriendsId))
            return false;
        FriendsId castOther = (FriendsId) other;
 
        return (this.getUserId() == castOther.getUserId())
                && (this.getFriendId() == castOther.getFriendId());
    }
 
    public int hashCode() {
        int result = 17;
 
        result = 37 * result + this.getUserId();
        result = 37 * result + this.getFriendId();
        return result;
    }
 
}