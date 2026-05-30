package com.bookmyticket.entity;
import jakarta.persistence.*; import lombok.*;
@Entity @Table(name="seats") @Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Seat { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; @ManyToOne(optional=false) private Theater theater; @Column(nullable=false) private String seatNumber; @Enumerated(EnumType.STRING) private SeatStatus status; }
