package models;

import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;

@Entity
public class BoardGame extends Model {



    @Id
    public Integer id;
    public String name;
    public String categorie;
    public Date date ;
    public String pictureLink;
    public String editeur;
    public String resume;
    public Boolean isCollection;
    public Integer numCollection;
    public Integer numMaxCollection;
    public String genre;
    public String language;
    public String duration;
    public Integer ageMin;
    public Integer numMinPlayer;
    public Integer numMaxPlayer;

    public BoardGame() {
    }

    public BoardGame(Integer id, String name, String categorie, Date date, String pictureLink, String editeur, String resume, Boolean isCollection, Integer numCollection, Integer numMaxCollection, String genre, String language, String duration, Integer ageMin, Integer numMinPlayer, Integer numMaxPlayer) {
        this.id = id;
        this.name = name;
        this.categorie = categorie;
        this.date = date;
        this.pictureLink = pictureLink;
        this.editeur = editeur;
        this.resume = resume;
        this.isCollection = isCollection;
        this.numCollection = numCollection;
        this.numMaxCollection = numMaxCollection;
        this.genre = genre;
        this.language = language;
        this.duration = duration;
        this.ageMin = ageMin;
        this.numMinPlayer = numMinPlayer;
        this.numMaxPlayer = numMaxPlayer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
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

    public Integer getAgeMin() {
        return ageMin;
    }

    public void setAgeMin(Integer ageMin) {
        this.ageMin = ageMin;
    }

    public Integer getNumMinPlayer() {
        return numMinPlayer;
    }

    public void setNumMinPlayer(Integer numMinPlayer) {
        this.numMinPlayer = numMinPlayer;
    }

    public Integer getNumMaxPlayer() {
        return numMaxPlayer;
    }

    public void setNumMaxPlayer(Integer numMaxPlayer) {
        this.numMaxPlayer = numMaxPlayer;
    }

    public static Finder<Integer, BoardGame> getFind() {
        return find;
    }

    public static void setFind(Finder<Integer, BoardGame> find) {
        BoardGame.find = find;
    }

    public static Finder<Integer, BoardGame> find = new Finder<Integer, BoardGame>(BoardGame.class);
    public static List<BoardGame> getList() {
        return find.findList();
    }

    public static BoardGame getBoardGameByName(String name) {
        return find.where().like("name",name).findUnique();
    }

    public static List<BoardGame> getByCategorie(String categorie) {
        return find.where().like("categorie", categorie).findList();
    }

    public static List<BoardGame> getByMaxPlayer(Integer numMaxPlayer) {
        return find.where().eq("numMaxPlayer", numMaxPlayer).findList(); }

    public static List<BoardGame> getByGenre(String genre) {
        return find.where().like("genre", genre).findList();
    }


}
