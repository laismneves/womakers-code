package org.womakerscode.seriesdatabase.repository;

import org.springframework.data.repository.CrudRepository;
import org.womakerscode.seriesdatabase.entity.Serie;

public interface SeriesRepository extends CrudRepository<Serie, Integer> {
}
