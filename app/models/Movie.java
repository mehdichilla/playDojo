package models;

import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;

@Entity
public class Movie extends Model {

    @Id
    public Integer id;
    public String name;
    public String categorie;
    public Date date;
    public String pictureLink;
    public String editeur;
    public String resume;
    public Boolean isCollection;
    public Integer numCollection;
    public Integer numMaxCollection;
    public String realisator;
    public String genre;
    public String language;
    public String duration;
    public List<Actor> actorList;


    public Movie() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPictureLink() {
        return pictureLink;
    }

    public void setPictureLink(String pictureLink) {
        this.pictureLink = pictureLink;
    }

    public String getEditeur() {
        return editeur;
    }

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public Boolean getCollection() {
        return isCollection;
    }

    public void setCollection(Boolean collection) {
        isCollection = collection;
    }

    public Integer getNumCollection() {
        return numCollection;
    }

    public void setNumCollection(Integer numCollection) {
        this.numCollection = numCollection;
    }

    public Integer getNumMaxCollection() {
        return numMaxCollection;
    }

    public void setNumMaxCollection(Integer numMaxCollection) {
        this.numMaxCollection = numMaxCollection;
    }

    public String getRealisator() {
        return realisator;
    }

    public void setRealisator(String realisator) {
        this.realisator = realisator;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public List<Actor> getActorList() {
        return actorList;
    }

    public void setActorList(List<Actor> actorList) {
        this.actorList = actorList;
    }

    public Movie(String name, String categorie, String genre, Date date, String pictureLink, String editeur, String resume, Boolean isCollection, Integer numCollection, Integer numMaxCollection, String realisator, String language, String duration, List<Actor> actorList) {

        this.name = name;
        this.categorie = categorie;
        this.genre = genre;
        this.date = date;
        this.pictureLink = pictureLink;
        this.editeur = editeur;
        this.resume = resume;
        this.isCollection = isCollection;
        this.numCollection = numCollection;
        this.numMaxCollection = numMaxCollection;
        this.realisator = realisator;
        this.language = language;
        this.duration = duration;
        this.actorList = actorList;
    }

    public static Finder<Integer, Movie> find = new Finder<Integer, Movie>(Movie.class);


    public static List<Movie> getList() {
        return find.findList();
    }

    public static List<Movie> getByCategorie(String categorie) {
        return find.where().like("categorie", categorie).findList();
    }

    public static List<Movie> getByRealisator(String realisator) {
        return find.where().like("realisateur", realisator).findList();
    }

    public static List<Movie> getByGenre(String genre) {
        return find.where().like("genre", genre).findList();
    }

    public static Movie getMovieByName(String name) {
        return find.where().like("name",name).findUnique();
    }


}
