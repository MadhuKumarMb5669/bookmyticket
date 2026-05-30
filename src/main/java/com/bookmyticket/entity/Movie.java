package com.bookmyticket.entity;
import jakarta.persistence.*; import jakarta.validation.constraints.*; import lombok.*; import java.time.LocalDate;
@Entity @Table(name="movies") @Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Movie { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; @NotBlank private String name; @Column(length=2000) private String description; @NotBlank private String language; @NotBlank private String genre; @NotBlank private String duration; private LocalDate releaseDate; @Column(length=1000) private String posterImageUrl; @Enumerated(EnumType.STRING) private MovieStatus status; }
