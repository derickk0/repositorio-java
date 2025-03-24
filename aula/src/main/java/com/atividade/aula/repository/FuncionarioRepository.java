package com.atividade.aula.repository;

import com.atividade.aula.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository <Funcionario, Long> {

}
