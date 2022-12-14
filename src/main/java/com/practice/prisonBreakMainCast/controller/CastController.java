package com.practice.prisonBreakMainCast.controller;

import com.practice.prisonBreakMainCast.repository.entity.Cast;
import com.practice.prisonBreakMainCast.service.CastService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/casts")
public class CastController {

    private final CastService castService;

    public CastController(CastService castService){
        this.castService = castService;
    }
    @CrossOrigin("*")
    @GetMapping
    public List<Cast> getCasts(){
        return castService.all();
    }
    @CrossOrigin("*")
    @PostMapping
    public void addCast(@RequestBody Cast cast){
        castService.add(cast);
    }
}
