package com.utn.devops.models;

import lombok.Data;

import java.util.Date;

@Data
public class Player {
    Integer id;
    String firstName;
    String lastName;
    Date birthday;
}
