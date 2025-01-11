package com.Musicom.data.repository;

import com.Musicom.data.model.Release;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReleaseRepository extends JpaRepository<Release, Long> {
}
