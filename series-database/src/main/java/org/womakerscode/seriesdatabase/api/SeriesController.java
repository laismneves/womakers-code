package org.womakerscode.seriesdatabase.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.womakerscode.seriesdatabase.entity.Serie;
import org.womakerscode.seriesdatabase.repository.SeriesRepository;

import java.util.List;


@RestController
public class SeriesController {

    private SeriesRepository seriesRepository;

    public SeriesController(SeriesRepository seriesRepository) {
        this.seriesRepository = seriesRepository;
    }

    @GetMapping("/series")
    public ResponseEntity<List<Serie>>listar(){

        List<Serie> series = seriesRepository.findAll();
        return new ResponseEntity<>(series, HttpStatus.OK);
    }

    @GetMapping("serie/{id}")
    public ResponseEntity<Serie> buscarPorId(@PathVariable("id") Integer id) {

        Serie serie = seriesRepository.findById(id).get();
        return new ResponseEntity<Serie>(serie, HttpStatus.OK);
    }

    @PostMapping("/serie")
    public ResponseEntity<Void> inserir(@RequestBody Serie serie) {

        seriesRepository.save(serie);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
