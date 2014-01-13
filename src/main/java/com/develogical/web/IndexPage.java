package com.develogical.web;

import java.io.PrintWriter;

public class IndexPage extends HtmlPage {

    @Override
    protected void writeContentTo(PrintWriter writer) {
        writer.println(
                "<p>Search for someone: " +
                "<form><input action=\"GET\" type=\"text\" name=\"q\" />" +
                "<input type=\"submit\"></form></p>");
    }
    
}
