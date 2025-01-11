package com.Musicom.data.repository;

import com.Musicom.data.model.Stats;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatsRepository extends JpaRepository<Stats, Long> {
}
