package bkhstudies.restapiex01.domain;

import lombok.Data;

@Data
public class UserDomain {
    private String userId;
    private String userName;

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
