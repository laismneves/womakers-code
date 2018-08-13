package org.womakerscode.seriesdatabase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.womakerscode.seriesdatabase.entity.Serie;

public interface SeriesRepository extends JpaRepository<Serie, Integer> {
}
