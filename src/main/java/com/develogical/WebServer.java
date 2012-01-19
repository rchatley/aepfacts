package com.develogical;

import com.develogical.web.IndexPage;
import com.develogical.web.SearchResultsPage;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class WebServer extends HttpServlet {

    /**
     * Handle a GET request to the server
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String query = req.getParameter("q");
        if (query != null) {
            // Log each query out to the console
            System.out.println("Query: " + query);
        }
        
        resp.setContentType("text/plain");
        resp.getWriter().println(process(query));
    }

    /**
     * Process a given query, producing a text string as a result
     */
    public String process(String query) {
        if (false) { // you should change this =)
            // How do you determine how to handle a given query?
            return "";
        } else {
            // A sensible default
            return "Unknown";
        }
    }

    public static void main(String[] args) throws Exception {
        int port;
        try {
            port = Integer.valueOf(System.getenv("PORT"));
        } catch (Exception e) {
            // could not parse PORT env variable - using present port;
            port = 5000;
        }

        Server server = new Server(port);
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");
        server.setHandler(context);
        context.addServlet(new ServletHolder(new WebServer()), "/*");
        server.start();
        server.join();
    }
}

