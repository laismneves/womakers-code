package org.womakerscode.seriesdatabase.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.womakerscode.seriesdatabase.repository.SeriesRepository;
import org.womakerscode.seriesdatabase.entity.Serie;


@RestController
public class SeriesController {

    @Autowired
    private SeriesRepository seriesRepository;

    @GetMapping("/series")
    public ResponseEntity<Iterable<Serie>>listar(){

        Iterable<Serie> series = seriesRepository.findAll();

        return new ResponseEntity<Iterable<Serie>>(series, HttpStatus.OK);
    }

    @PostMapping("/serie")
    public ResponseEntity<Void> inserir(@RequestBody Serie serie) {

        seriesRepository.save(serie);

        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }

}
