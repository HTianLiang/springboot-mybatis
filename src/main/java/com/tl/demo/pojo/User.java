package com.tl.demo.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter@Getter@ToString
public class User {
    private int user_id;
    private String user_code;
    private String user_name;
    private String user_password;
    private String user_state;
}
