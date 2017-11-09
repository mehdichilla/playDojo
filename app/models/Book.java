package models;

import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;

@Entity
public class Book  extends Model {

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

    public Book() {
    }

    public Book(String name, String categorie, Date date, String pictureLink, String editeur, String resume, Boolean isCollection, Integer numCollection, Integer numMaxCollection, String genre, String language) {
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

    public static Finder<Integer, Book> find = new Finder<Integer, Book>(Book.class);


    public static List<Book> getList() {
        return find.findList();
    }

    public static List<Book> getByCategorie(String categorie) {
        return find.where().like("categorie", categorie).findList();
    }

    public static List<Book> getByLanguage(String language) {
        return find.where().like("language", language).findList();
    }

    public static List<Book> getByGenre(String genre) {
        return find.where().like("genre", genre).findList();
    }

    public static List<Book> getBookByName(String name) {
        return find.where().like("name",name).findList();
    }

    public Book(Integer id, String name, String categorie, Date date, String pictureLink, String editeur, String resume, Boolean isCollection, Integer numCollection, Integer numMaxCollection, String genre, String language) {
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
    }
}
