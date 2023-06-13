package co.edu.sena.project2687351.servlets;

import co.edu.sena.project2687351.model.Categories;

import co.edu.sena.project2687351.model.repository.Repository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import co.edu.sena.project2687351.model.repository.CategoryRepositoryImpl;

@WebServlet("/categories_register")

public class CategoryRegisterServlets extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //collect all form data
        String category_name=request.getParameter("category_name");

        //fill it up in a user bean
        Categories category = new Categories();
        category.setCategory_name(category_name);


        //call repository tayer and save the user object to do
        Repository<Categories> repository = new CategoryRepositoryImpl();
        int rows = 0;
        try {
            repository.saveObj(category);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //prepare an information message for user about success or failure of the operation
        if(rows == 0){
            System.out.println("ocurrió un error");
        }else{
            System.out.println("registro exitoso");
        }

        //todo write the mesaje back to the page in client browser
    }
}

