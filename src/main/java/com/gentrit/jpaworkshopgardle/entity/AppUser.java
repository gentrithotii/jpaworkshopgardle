package com.gentrit.jpaworkshopgardle.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode

@Entity
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Column(updatable = false, nullable = false)
    private long id;

    @Getter
    @Setter
    @Column(unique = true, nullable = false, length = 150)
    private String username;

    @Getter
    @Setter
    @Column(nullable = false, length = 70)
    private String password;

    @Getter
    @Column(nullable = false)
    private LocalDate regDate;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "details_id")
    private Details userDetails;

    @OneToMany(mappedBy = "appUser")
    List<Todo> todoList = new ArrayList<>();

    public AppUser(String username, String password, LocalDate regDate, Details userDetails) {
        this.username = username;
        this.password = password;
        this.regDate = regDate;
        this.userDetails = userDetails;
    }

    @PrePersist
    public void onCreation() {
        this.regDate = LocalDate.now();
    }
}
