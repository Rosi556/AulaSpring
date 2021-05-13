package com.aula88888.aula88888.repository;

import com.aula88888.aula88888.entidade.Venda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendaRepository extends JpaRepository<Venda, Long> {

    Venda findById (long id);
}
