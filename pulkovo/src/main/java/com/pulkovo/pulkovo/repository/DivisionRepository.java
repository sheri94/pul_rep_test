package com.pulkovo.pulkovo.repository;

import com.pulkovo.pulkovo.model.Divisions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DivisionRepository extends JpaRepository<Divisions, Long> {
}
