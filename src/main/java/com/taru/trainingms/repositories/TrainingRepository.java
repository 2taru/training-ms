package com.taru.trainingms.repositories;

import com.taru.trainingms.models.Training;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainingRepository extends JpaRepository<Training, Integer> {
}
