package co.edu.sena.project2687351.model.repository;

import co.edu.sena.project2687351.model.Categories;

import java.sql.SQLException;


public class TestCategoryRepositoryImpl {

    public static  void main(String[] args) throws SQLException {
        Repository<Categories> repository = new CategoryRepositoryImpl();

        System.out.println("==========  saveObj Insert ==========");  //  insert
        Categories categoryInsert = new Categories();
        categoryInsert.setCategory_name("Deportes");
        repository.saveObj(categoryInsert);
        categoryInsert.setCategory_name("Alimentos");
        repository.saveObj(categoryInsert);
        categoryInsert.setCategory_name("juegos");
        repository.saveObj(categoryInsert);

        System.out.println("==========  listAllObj ==========");
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("==========  byIdObj ==========");
        System.out.println(repository.byIdObj(1));
        System.out.println();

        System.out.println("==========  saveObj =========="); // update
        Categories categoriesUpdate = new Categories();
        categoriesUpdate.setCategory_id(2);
        categoriesUpdate.setCategory_name("juegos");
        repository.saveObj(categoriesUpdate);
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("==========  deleteObj ==========");
        repository.deleteObj(2);
        repository.listAllObj().forEach(System.out::println);

    }
}  // TestUserRepositoryImpl
