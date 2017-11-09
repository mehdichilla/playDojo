package controllers;

import com.avaje.ebean.Ebean;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.inject.Inject;
import models.Actor;
import play.data.FormFactory;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

public class ActorCtrl extends Controller {

    @Inject
    FormFactory formFactory;

    public Result saveActor(){
        Actor actor = formFactory.form(Actor.class).bindFromRequest().get();
        Ebean.save(actor);
        ObjectNode result = Json.newObject();
        result.put("id", actor.getId());
        return created(result);
    }


    public Result deleteActor(Integer id) {

        Ebean.find(Actor.class).where().idEq(id).findUnique().delete();
        return ok();
    }

    public Result getAllActor() {

        return ok(Json.toJson(Actor.getList()));
    }
    public Result getActorByName(String name) {

        return ok(Json.toJson(Actor.getActorByName(name)));
    }


}
