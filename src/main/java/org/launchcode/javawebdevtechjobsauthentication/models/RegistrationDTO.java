package org.launchcode.javawebdevtechjobsauthentication.models;

public class RegistrationDTO  extends LoginDTO {
    private String verifyPassword;

    public String getVerifyPassword() {
        return verifyPassword;
    }

    public void setVerifyPassword(String verifyPassword) {
        this.verifyPassword = verifyPassword;
    }

}