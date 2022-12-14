package com.practice.prisonBreakMainCast.repository;

import com.practice.prisonBreakMainCast.repository.entity.Cast;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CastRepository extends JpaRepository<Cast, Integer> {
}
