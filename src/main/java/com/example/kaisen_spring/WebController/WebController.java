package com.example.kaisen_spring.WebController;

import com.example.kaisen_spring.model.GameService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class WebController {
    GameService service=new GameService();

    @GetMapping("Menu")
    public String set(Model model){
        return "menu";
    }
    @PostMapping("Menu")
    public String set(Model model,int width,int length){
        service.settingGame(width,length);
        return "game";
    }
    @GetMapping("Game")
    public String game(Model model){
        return "game";
    }
    @PostMapping("Game")
    public String game(Model model,int width,int length){
        String[] a={"1","1","1","1","1"};

        service.update(width,length);
        //model.addAttribute("infos",service.getEnemyField().getField());//値の入力
        model.addAttribute("infos",a);
        return "game";
    }
}
