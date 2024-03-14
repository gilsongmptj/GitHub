package br.edu.unime.Vacinacao.httpClient;

import br.edu.unime.Vacinacao.entity.Vacina;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "Vacina", url = "localhost:8080/api/")
public interface VacinaHttpClient {
    @GetMapping("Vacina/{id}")
    public ResponseEntity<Vacina> obterVacina(@PathVariable("id") String id);
}
