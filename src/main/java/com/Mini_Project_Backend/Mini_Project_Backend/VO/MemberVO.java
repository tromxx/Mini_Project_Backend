package com.Mini_Project_Backend.Mini_Project_Backend.VO;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter

public class MemberVO {
    private String id;
    private String pwd;
    private String name;
    private String email;
    private Date join;
}