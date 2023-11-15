package it.idabi;

import com.fasterxml.jackson.core.JsonToken;

import java.net.URL;
import java.util.List;

public class TvSeries {

    public int id;
    public URL url;
    public String name;
    public String type;
    public String language;

    public List<String> genres;

    public Rating rating;


    public static class Rating {
        public double average;
    }
}
