package com.excalibur.project.repositories;

import com.excalibur.project.entities.Game;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long>{

}