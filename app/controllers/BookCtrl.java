package controllers;

import com.avaje.ebean.Ebean;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.inject.Inject;
import models.Book;
import play.data.FormFactory;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BookCtrl extends Controller {

    @Inject
    FormFactory formFactory;

    public Result saveBook(){
        Book book = formFactory.form(Book.class).bindFromRequest().get();
        Ebean.save(book);
        ObjectNode result = Json.newObject();
        result.put("id", book.getId());
        return created(result);
    }



    public Result deleteBook(Integer id) {

        Ebean.find(Book.class).where().idEq(id).findUnique().delete();
        return ok();
    }

    public Result getAllBooks() {

        return ok(Json.toJson(Book.getList()));
    }
    public Result getBookByName(String name) {

        return ok(Json.toJson(Book.getBookByName(name)));
    }

    public Result getByGenre(String genre){
        return ok(Json.toJson(Book.getByGenre(genre)));
    }

    public Result getByCategorie(String categorie){
        return ok(Json.toJson(Book.getByCategorie(categorie)));
    }

    public Result getByLanguage(String language){
        return ok(Json.toJson(Book.getByLanguage(language)));
    }

    public Result getProgressCollection(int lastVolume, int maxVolume) {
        return ok();
    }


}
