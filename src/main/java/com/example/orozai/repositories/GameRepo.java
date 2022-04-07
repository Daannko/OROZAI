package com.example.orozai.repositories;

import com.example.orozai.models.Game;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface GameRepo extends CrudRepository<Game,Integer> {

    List<Game> findGameById(int id);

}
