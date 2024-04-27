package com.taru.trainingms.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "training")
public class Training extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long trainingId;
    @Column(name = "title", nullable = false)
    private String title;
    @Column(name = "description", nullable = false)
    private String description;
    @OneToMany(mappedBy = "training", cascade = CascadeType.ALL, orphanRemoval = true)
    List<Exercise> exercises = new ArrayList<>();
}
