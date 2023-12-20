package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties (ignoreUnknown = true)

public record DadosSerie(@JsonAlias("Title") String Titulo,
                         @JsonAlias("totalSeasons") int TotalTemp,
                         @JsonAlias("Title") String avaliacao) {
}
