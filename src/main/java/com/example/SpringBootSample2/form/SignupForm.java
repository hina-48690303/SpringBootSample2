package com.example.SpringBootSample2.form;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

@Data
public class SignupForm {
  private String userId;
  private String password;
  private String userName;

  @DateTimeFormat(pattern = "yyyy/MM/dd")
  private Data birthday;

  private Integer age;
  private Integer gender;
}
