package com.practice.prisonBreakMainCast.service;

import com.practice.prisonBreakMainCast.repository.CastRepository;
import com.practice.prisonBreakMainCast.repository.entity.Cast;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CastService {

    private final CastRepository castRepository;

    public CastService(CastRepository castRepository){
        this.castRepository = castRepository;
    }

    public List<Cast> all() {
        return castRepository.findAll();
    }

    public void add(Cast cast) {
        castRepository.save(cast);
    }
}
