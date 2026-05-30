package com.bookmyticket.entity;
import jakarta.persistence.*; import lombok.*;
@Entity @Table(name="booking_seats", uniqueConstraints=@UniqueConstraint(columnNames={"show_id","seat_number"})) @Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class BookingSeat { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; @ManyToOne(optional=false) private Booking booking; @ManyToOne(optional=false) private Show show; @Column(nullable=false) private String seatNumber; }
