package com.examly.springapp.entity;

public class JwtResponse {

    private UserModel userModel;
    private String jwtToken;

    public JwtResponse(UserModel userModel, String jwtToken) {
        this.userModel = userModel;
        this.jwtToken = jwtToken;
    }

    public UserModel getUser() {
        return userModel;
    }

    public void setUser(UserModel userModel) {
        this.userModel = userModel;
    }

    public String getJwtToken() {
        return jwtToken;
    }

    public void setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
    }
}
