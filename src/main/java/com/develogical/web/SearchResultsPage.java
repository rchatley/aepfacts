package com.develogical.web;

import com.develogical.AepFactsDatabase;
import com.develogical.web.HtmlPage;

import java.io.PrintWriter;

public class SearchResultsPage extends HtmlPage {

    private final String name;

    public SearchResultsPage(String name) {
        this.name = name;
    }

    @Override
    protected void writeContentTo(PrintWriter writer) {
        AepFactsDatabase.MiniBiog result = new AepFactsDatabase().lookup(name);
        if (result == null) {
            writer.println("<p>Nothing known about " + name + "</p>");
        } else {
            writer.println("<h1>" + name + "</h1>");
            writer.println("<img src=\"" + result.imageUrl() + "\"/>");
            writer.println("<p>" + result.text() + "</p>");
        }

        writer.println("<p><a href=\"/\">Back to Search Page</a></p>");
    }
}
