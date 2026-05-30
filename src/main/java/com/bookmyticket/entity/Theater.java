package com.bookmyticket.entity;
import jakarta.persistence.*; import jakarta.validation.constraints.*; import lombok.*;
@Entity @Table(name="theaters") @Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Theater { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; @NotBlank private String name; @NotBlank private String city; private String address; }
