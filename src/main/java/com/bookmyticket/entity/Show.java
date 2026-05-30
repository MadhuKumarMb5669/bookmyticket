package com.bookmyticket.entity;
import jakarta.persistence.*; import jakarta.validation.constraints.*; import lombok.*; import java.math.BigDecimal; import java.time.*;
@Entity @Table(name="shows") @Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Show { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; @ManyToOne(optional=false) private Movie movie; @ManyToOne(optional=false) private Theater theater; @NotNull private LocalDate showDate; @NotNull private LocalTime showTime; @NotNull private BigDecimal price; }
