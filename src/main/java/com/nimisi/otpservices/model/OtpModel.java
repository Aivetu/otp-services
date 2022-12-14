package com.nimisi.otpservices.model;

import com.nimisi.otpservices.enums.OtpStatus;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "otp_service")
public class OtpModel {
    @Id
    private String username;
    private String otp;
    private LocalDateTime expires_at;
    private LocalDateTime created_at;
    private LocalDateTime used_at;
    @Enumerated(EnumType.STRING)
    private OtpStatus status;



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }

    public LocalDateTime getExpires_at() {
        return expires_at;
    }

    public void setExpires_at(LocalDateTime expires_at) {
        this.expires_at = expires_at;
    }

    public OtpStatus getStatus() {
        return status;
    }

    public void setStatus(OtpStatus status) {
        this.status = status;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public LocalDateTime getUsed_at() {
        return used_at;
    }

    public void setUsed_at(LocalDateTime used_at) {
        this.used_at = used_at;
    }





}
