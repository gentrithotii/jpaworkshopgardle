package com.gentrit.jpaworkshopgardle.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor


@Entity
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Column(nullable = false, updatable = false)
    private long id;

    private String description;
    private boolean completeStatus;

    @ManyToOne()
    @JoinColumn(name = "app_user_id")
    private AppUser appUser;
}
