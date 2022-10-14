package com.utn.devops.models.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.utn.devops.models.entities.base.PersistentObject;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "players")
public class Player extends PersistentObject {
    String firstName;
    String lastName;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/YYYY")
    Date birthday;
}
