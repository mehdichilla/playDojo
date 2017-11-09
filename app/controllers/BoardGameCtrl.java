package controllers;

import com.avaje.ebean.Ebean;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.inject.Inject;
import models.BoardGame;
import play.data.FormFactory;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

public class BoardGameCtrl extends Controller {

    @Inject
    FormFactory formFactory;

    public Result saveBoardGame() {
        BoardGame boardGame = formFactory.form(BoardGame.class).bindFromRequest().get();
        Ebean.save(boardGame);
        ObjectNode result = Json.newObject();
        result.put("id", boardGame.getId());
        return created(result);
    }


    public Result deleteBoardGame(Integer id) {

        Ebean.find(BoardGame.class).where().idEq(id).findUnique().delete();
        return ok();
    }

    public Result getAllBoardGame() {

        return ok(Json.toJson(BoardGame.getList()));
    }

    public Result getBoardGameByName(String name) {

        return ok(Json.toJson(BoardGame.getBoardGameByName(name)));
    }

    public Result getByGenre(String genre) {

        return ok(Json.toJson(BoardGame.getByGenre(genre)));
    }

    public Result getByCategorie(String categorie) {

        return ok(Json.toJson(BoardGame.getByCategorie(categorie)));
    }

    public Result getByMaxPlayer(Integer numMaxPlayer) {
        return ok(Json.toJson(BoardGame.getByMaxPlayer(numMaxPlayer)));
    }




}
