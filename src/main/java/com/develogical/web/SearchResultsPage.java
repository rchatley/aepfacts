package com.develogical.web;

import com.develogical.AepFactsDatabase;
import com.develogical.Key;

import java.io.PrintWriter;
import java.util.Map;

public class SearchResultsPage extends HtmlPage {

    private final String query;
    private final Map<Key, String> result;

    public SearchResultsPage(String query, Map<Key, String> result) {
        this.query = query;
        this.result = result;
    }

    @Override
    protected void writeContentTo(PrintWriter writer) {
        if (result == null) {
            writer.println("<p>Nothing known about " + query + "</p>");
        } else {
            writer.println("<h1>" + query + "</h1>");
            if (result.containsKey(Key.IMAGE)) {
                writer.println("<img src=\"" + result.get(Key.IMAGE) + "\"/>");
            }
            writer.println("<p>" + result.get(Key.TEXT) + "</p>");
        }

        writer.println("<p><a href=\"/\">Back to Search Page</a></p>");
    }
}
