package com.aula88888.aula88888.repository;

import com.aula88888.aula88888.entidade.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepository  extends JpaRepository<Cliente, Long> {

    Cliente findById(long id);
}


