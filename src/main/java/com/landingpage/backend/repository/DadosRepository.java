package com.landingpage.backend.repository;

import com.landingpage.backend.model.Dados;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DadosRepository extends JpaRepository<Dados, Integer> {

}
