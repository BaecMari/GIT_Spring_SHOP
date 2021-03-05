package com.shop.domain;

import lombok.Data;

@Data
public class User_MembersVO {

    //User_Members

    private String userid;
    private String passwd;
    private String name;
    private int birthdate;
    private String cellphone; //수정 : 2021.03.05 (010으로 넣으면 8진수 인식 값 오류 발생)
    private int gender;
    private String address;
}
