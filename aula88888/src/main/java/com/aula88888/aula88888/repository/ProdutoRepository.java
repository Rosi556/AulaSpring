package com.aula88888.aula88888.repository;


import com.aula88888.aula88888.entidade.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    Produto findById (long id);
}
