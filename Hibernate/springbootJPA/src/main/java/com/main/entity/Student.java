package com.main.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "sbstu")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
@Id
@GeneratedValue
private int id;
private String sname;
private Long phno;
}
