package com.example.orozai.controlers;

import com.example.orozai.models.Game;
import com.example.orozai.repositories.GameRepo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/home")


public class Controler {

    private final GameRepo gameRepo;

    public Controler(GameRepo gameRepo) {
        this.gameRepo = gameRepo;
    }

    @GetMapping
    public String home()
    {
        return "home";
    }
    @GetMapping(value = "/Add")
    public String Add()
    {
        Game game = new Game();
        game.setName("LigaLegend");
        game.setPrice(69);
        gameRepo.save(game);
        return "Add";
    }
}
