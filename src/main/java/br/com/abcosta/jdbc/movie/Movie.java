package br.com.abcosta.jdbc.movie;

import br.com.abcosta.jdbc.actor.Actor;

import java.time.LocalDate;
import java.util.List;

public record Movie (
        Integer id,
        String name,
        List<Actor> actor,
        LocalDate releaseDate
) {}