package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import com.example.entity.Bill;

import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor  
@AllArgsConstructor 
@Entity
@Table(name = "tblorder")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer order_id;

    @ManyToOne
    @JoinColumn(name = "bill_id")
    private Bill bill;

    private Integer kin_id;
    private Integer table_id;
    private String order_number;
    private Timestamp order_created_time;
    private Timestamp order_modified_time;

}
