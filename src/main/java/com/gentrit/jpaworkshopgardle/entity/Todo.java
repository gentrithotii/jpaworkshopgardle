package com.gentrit.jpaworkshopgardle.entity;

import jakarta.persistence.*;
import lombok.*;

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


    @Getter
    @Setter
    private String description;

    @Getter
    @Setter
    private boolean completeStatus;

    @ManyToOne()
    @JoinColumn(name = "app_user_id")
    private AppUser appUser;
}
