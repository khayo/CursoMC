package br.com.dicasdopinguim.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dicasdopinguim.cursomc.domain.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {

}
