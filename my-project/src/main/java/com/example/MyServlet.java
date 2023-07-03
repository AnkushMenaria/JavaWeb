package com.example;

import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/plain");
        response.getWriter().println("Simple message from the GET request");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Handle POST request
        BufferedReader reader = request.getReader();
        Gson gson = new Gson();
        User user = gson.fromJson(reader, User.class);

        // Save the request data in a file
        String fileName = "request_" + System.currentTimeMillis() + ".json";
        String filePath = getServletContext().getRealPath("/") + fileName;

        try (FileWriter fileWriter = new FileWriter(filePath)) {
            fileWriter.write(gson.toJson(user));
        }

        // Create a JSON response acknowledging the request
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write("{\"message\": \"Request received successfully\"}");
    }
}
