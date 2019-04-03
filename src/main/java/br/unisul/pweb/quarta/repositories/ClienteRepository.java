package br.unisul.pweb.quarta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.unisul.pweb.quarta.domain.Cliente;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
