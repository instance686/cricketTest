package com.cricbuzz.test.sample.cricbuzztest.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cricbuzz.test.sample.cricbuzztest.model.PlayerStatsBatting;

@Repository
public interface PlayerBattingStatsRepository extends JpaRepository<PlayerStatsBatting, Long>{

	List<PlayerStatsBatting> findByPlayerId(Long id);

}
