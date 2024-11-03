package com.cursos.screenmatch.dto;

import com.cursos.screenmatch.model.Categoria;

public record SerieDTO(
        Long id,
         String titulo,
         Integer totalTemporadas,
         Double evaluacion,
         String poster,
         Categoria genero,
         String actores,
         String sinopsis
) {
}
