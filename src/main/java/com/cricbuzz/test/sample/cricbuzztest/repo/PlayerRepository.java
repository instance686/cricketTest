package com.cricbuzz.test.sample.cricbuzztest.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cricbuzz.test.sample.cricbuzztest.model.Player;


@Repository
public interface PlayerRepository extends JpaRepository<Player, Long>{

}
