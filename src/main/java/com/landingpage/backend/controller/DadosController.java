package com.landingpage.backend.controller;

import com.landingpage.backend.model.Dados;
import com.landingpage.backend.repository.DadosRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "https://landing-page-contrata-frontend.vercel.app")
@Tag(name = "Dados", description = "API para gerenciamento de dados dos usuários")
public class DadosController {

    @Autowired
    private DadosRepository dadosRepository;

    @Operation(
        summary = "Adicionar novos dados",
        description = "Endpoint para adicionar dados de um novo usuário"
    )
    @ApiResponse(responseCode = "201", description = "Dados criados com sucesso")
    @ApiResponse(responseCode = "500", description = "Erro interno do servidor")
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