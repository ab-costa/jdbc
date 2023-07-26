package br.com.abcosta.jdbc.movie;

import org.apache.commons.lang3.NotImplementedException;

import java.util.List;
import java.util.Optional;

public class MovieDaoImpl implements MovieDao{
    @Override
    public int insertMovie(Movie movie) {
        throw new NotImplementedException("not implemented");
    }

    @Override
    public List<Movie> selectMovies() {
        throw new NotImplementedException("not implemented");
    }

    @Override
    public Optional<Movie> selectMovieById(int id) {
        throw new NotImplementedException("not implemented");
    }

    @Override
    public int deleteMovie(int id) {
        throw new NotImplementedException("not implemented");
    }
}
