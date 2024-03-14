package br.edu.unime.Vacinacao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "vacina")
public class Vacina {

    @Id
    private String id;
    private String fabricante;
    private String lote;
    private LocalDate dataValidade;
    private int numeroDoses;
    private int intervaloMinimoEntreDoses;
}
