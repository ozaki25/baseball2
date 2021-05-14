package com.example.baseball2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.baseball2.domain.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {

}