package com.netcracker.Movist3.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="orders")
@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor

public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column (name="date", nullable = false)
    private Date date;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user_id;
}
