package com.sit.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "OBJET")
public class Objet {

    @Id
    @Column(name = "ID")
    private int id;
}
