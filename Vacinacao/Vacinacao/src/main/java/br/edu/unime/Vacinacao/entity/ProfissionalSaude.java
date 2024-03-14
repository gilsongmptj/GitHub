package br.edu.unime.Vacinacao.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProfissionalSaude {
    private String cpf;
    private String nome;
}
