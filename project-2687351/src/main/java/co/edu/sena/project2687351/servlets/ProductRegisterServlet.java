package co.edu.sena.project2687351.servlets;

import co.edu.sena.project2687351.model.Product;
import co.edu.sena.project2687351.model.repository.ProductRepositoryImpl;
import co.edu.sena.project2687351.model.repository.Repository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/products_register")

public class ProductRegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //collect all form data
        String product_name =request.getParameter("product_name");
        Integer product_value =Integer.valueOf(request.getParameter("product_value"));
        Integer category_id =Integer.valueOf(request.getParameter("category_id"));


        //fill it up in a user bean
        Product product = new Product();
        product.setProduct_name(product_name);
        product.setProduct_value(product_value);
        product.setCategory_id(category_id);

        //call repository tayer and save the user object to do
        Repository<Product> repository = new ProductRepositoryImpl();
        int rows = 0;
        try {
            repository.saveObj(product);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //prepare an information message for user about success or failure of the operation
        if(rows == 0){
            System.out.println("ocurrió un error");
        }else{
            System.out.println("registro exitoso");
        }

        // todo write the mesaje back to the page in client browser
    }
}
