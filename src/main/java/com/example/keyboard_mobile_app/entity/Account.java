package com.example.keyboard_mobile_app.entity;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;
@Data
@Getter
@Setter
public class Account {

    private String accountId;

    private String fullName;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    private String email;

    private String gender;

    private String imageUrl;

    private String phone;

    private boolean isFingerPrintAuthentication;
}