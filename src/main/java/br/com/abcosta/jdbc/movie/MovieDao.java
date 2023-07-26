package br.com.abcosta.jdbc.movie;

import java.util.List;
import java.util.Optional;

public interface MovieDao {
    int insertMovie (Movie movie);
    List<Movie> selectMovies ();
    Optional<Movie> selectMovieById (int id);
    int deleteMovie (int id);
}
