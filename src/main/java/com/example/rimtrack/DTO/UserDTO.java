package com.example.rimtrack.DTO;

public class UserDTO {
        private Integer userId;
    private String username;
    private String password;
    private String role;
    public UserDTO(Integer userId, String username, String password, String role) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.role = role;
    }
    public UserDTO() {
    }
    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    @Override
    public String toString() {
        return "UserDTO [userId=" + userId + ", username=" + username + ", password=" + password + ", role=" + role
                + "]";
    }

}
