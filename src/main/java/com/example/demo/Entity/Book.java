package com.example.demo.Entity;

import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Book")
public class Book {

    private Integer ID;
    private String Title;
    private String Author;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }
}
