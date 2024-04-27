package com.taru.trainingms.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
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
    @OneToMany(mappedBy = "training", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    List<Exercise> exercises = new ArrayList<>();

    @Override
    public String toString() {
        return "Training{" +
                "trainingId=" + trainingId +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                super.toString();
    }
}
