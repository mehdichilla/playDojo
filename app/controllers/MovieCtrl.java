package controllers;

import com.avaje.ebean.Ebean;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.inject.Inject;
import models.Movie;
import play.data.FormFactory;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

public class MovieCtrl extends Controller {

    @Inject
    FormFactory formFactory;

    public Result saveMovie(){
        Movie movie = formFactory.form(Movie.class).bindFromRequest().get();
        Ebean.save(movie);
        ObjectNode result = Json.newObject();
        result.put("id", movie.getId());
        return created(result);
    }


    public Result deleteMovie(Integer id) {

        Ebean.find(Movie.class).where().idEq(id).findUnique().delete();
        return ok();
    }

    public Result getAllMovies() {

        return ok(Json.toJson(Movie.getList()));
    }
    public Result getMovieByName(String name) {

        return ok(Json.toJson(Movie.getMovieByName(name)));
    }

    public Result getByGenre(String genre){
        return ok(Json.toJson(Movie.getByGenre(genre)));
    }

    public Result getByCategorie(String categorie){
        return ok(Json.toJson(Movie.getByCategorie(categorie)));
    }

    public Result getByRealisator(String realisator){
        return ok(Json.toJson(Movie.getByRealisator(realisator)));
    }



}
