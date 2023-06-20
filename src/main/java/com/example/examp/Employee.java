package com.example.examp;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "Employees")
public class Employee {
    @Id
    private int id;

    private String name;

    private BigDecimal wage;
}
