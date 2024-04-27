package com.taru.trainingms.models;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "exercise")
public class Exercise extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long exerciseId;
    @Column(name = "title", nullable = false)
    private String title;
    @Column(name = "description", nullable = false)
    private String description;
    @Column(name = "repetitions_count")
    private Integer repetitionsCount;
    @Column(name = "approaches_count")
    private Integer approachesCount;
    @Column(name = "weight")
    private Integer weight;
    @Column(name = "duration_time")
    private Integer durationTime;
    @Column(name = "rest_time")
    private Integer restTime;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "training_id")
    private Training training;
}
