package models;

import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Actor extends Model {

    @Id
    public Integer id;
    public String lastName;
    public String firstName;
    public String nationality;
    public List<Actor>actorList;


    public static Finder<Integer, Actor> find = new Finder<Integer, Actor>(Actor.class);

    public Actor(String lastName, String firstName, String nationality) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.nationality = nationality;
    }

    public Actor() {
    }

    public List<Actor> getActorList() {
        return actorList;
    }

    public void setActorList(List<Actor> actorList) {
        this.actorList = actorList;
    }
    public static List<Actor> getList() {
        return find.findList();
    }

    public static Actor getActorByName(String name) {
        return find.where().like("name",name).findUnique();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
