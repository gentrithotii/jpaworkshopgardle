package com.gentrit.jpaworkshopgardle.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode


@Entity
public class Details {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Column(nullable = false, updatable = false)
    private long id;

    @Getter
    @Column(unique = true, nullable = false, length = 70)
    private String email;

    @Getter
    @Setter
    @Column(nullable = false, length = 70)
    private String name;

    @Getter
    @Column(updatable = false, nullable = false)
    private LocalDate birthDate;

    public Details(String email, String name, LocalDate birthDate) {
        this.email = email;
        this.name = name;
        this.birthDate = birthDate;
    }
}
