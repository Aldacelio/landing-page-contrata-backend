package com.landingpage.backend.controller;

import com.landingpage.backend.model.Dados;
import com.landingpage.backend.repository.DadosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "https://landing-page-contrata-frontend.vercel.app")
public class DadosController {

    @Autowired
    private DadosRepository dadosRepository;

    @PostMapping("/dados")
    public ResponseEntity<Dados> adicionarDados(@RequestBody Dados dados) {
        try {
            Dados novoDado = dadosRepository.save(dados);
            return ResponseEntity.status(HttpStatus.CREATED).body(novoDado);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}