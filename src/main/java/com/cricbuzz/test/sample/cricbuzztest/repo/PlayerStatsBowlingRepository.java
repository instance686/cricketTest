package com.cricbuzz.test.sample.cricbuzztest.repo;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cricbuzz.test.sample.cricbuzztest.model.PlayerStatsBowling;

@Repository
public interface PlayerStatsBowlingRepository extends JpaRepository<PlayerStatsBowling, Long>{

}
