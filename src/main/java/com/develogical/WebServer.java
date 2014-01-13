package com.develogical;

import com.develogical.web.ApiResponse;
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
import java.util.Map;

public class WebServer {

    class Website extends HttpServlet {
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            try {

                String query = req.getParameter("q");
                if (query == null) {
                    new IndexPage().writeTo(resp);
                } else {
                    new SearchResultsPage(query, process(query)).writeTo(resp);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    class Api extends HttpServlet {
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            try {

                String query = req.getParameter("q");
                new ApiResponse(new QueryProcessor().process(query)).writeTo(resp);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private Map<Key,String> process(String query) {
        return new AepFactsDatabase().lookup(query);
    }

    public WebServer() throws Exception {
        Server server = new Server(8080);
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");
        server.setHandler(context);
        context.addServlet(new ServletHolder(new Api()), "/api/*");
        context.addServlet(new ServletHolder(new Website()), "/*");
        server.start();
        server.join();
    }

    public static void main(String[] args) throws Exception {
        new WebServer();
    }
}