package com.examly.springapp.entity;

public class JwtRequest {

        private String email;
        private String password;

        public String getUserName() {
            return email;
        }

        public void setUserName(String email) {
            this.email = email;
        }

        public String getUserPassword() {
            return password;
        }

        public void setUserPassword(String password) {
            this.password = password;
        }
    }
