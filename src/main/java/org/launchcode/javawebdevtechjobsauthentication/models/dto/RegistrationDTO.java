package org.launchcode.javawebdevtechjobsauthentication.models.dto;

import org.launchcode.javawebdevtechjobsauthentication.models.dto.LoginDTO;

public class RegistrationDTO  extends LoginDTO {
    private String verifyPassword;

    public String getVerifyPassword() {
        return verifyPassword;
    }

    public void setVerifyPassword(String verifyPassword) {
        this.verifyPassword = verifyPassword;
    }

}