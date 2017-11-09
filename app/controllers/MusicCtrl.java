package controllers;

import com.avaje.ebean.Ebean;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.inject.Inject;
import models.Music;
import play.data.FormFactory;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

public class MusicCtrl extends Controller {

    @Inject
    FormFactory formFactory;

    public Result saveMusic(){
        Music music = formFactory.form(Music.class).bindFromRequest().get();
        Ebean.save(music);
        ObjectNode result = Json.newObject();
        result.put("id", music.getId());
        return created(result);
    }


    public Result deleteMusic(Integer id) {

        Ebean.find(Music.class).where().idEq(id).findUnique().delete();
        return ok();
    }

    public Result getAllMusic() {

        return ok(Json.toJson(Music.getList()));
    }
    public Result getMusicByNameAlbum(String name) {

        return ok(Json.toJson(Music.getMusicByAlbum(name)));
    }

    public Result getByGenre(String genre){
        return ok(Json.toJson(Music.getByGenre(genre)));
    }

    public Result getByCategorie(String categorie){
        return ok(Json.toJson(Music.getByCategorie(categorie)));
    }

    public Result getMusicBySinger(String singerName){
        return ok(Json.toJson(Music.getMusicBySinger(singerName)));
    }


}
