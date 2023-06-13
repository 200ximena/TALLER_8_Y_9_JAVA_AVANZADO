package co.edu.sena.project2687351.model.repository;
import co.edu.sena.project2687351.model.Product;

import java.sql.SQLException;

public class TestProductRepositoryImpl {

    public static  void main(String[] args) throws SQLException{
        Repository<Product> repository = new ProductRepositoryImpl();

        System.out.println("==========  saveObj Insert ==========");  //  insert
        Product productInsert = new Product();
        productInsert.setProduct_name("balon");
        productInsert.setProduct_value(50000);
        productInsert.setCategory_id(1);
        repository.saveObj(productInsert);
        productInsert.setProduct_name("pantalon");
        productInsert.setProduct_value(45600);
        productInsert.setCategory_id(1);
        repository.saveObj(productInsert)
        ;
        productInsert.setProduct_name("balon");
        productInsert.setProduct_value(50000);
        repository.saveObj(productInsert);

        System.out.println("==========  listAllObj ==========");
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("==========  byIdObj ==========");
        System.out.println(repository.byIdObj(1));
        System.out.println();

        System.out.println("==========  saveObj =========="); // update
        Product ProductUpdate = new Product();
        ProductUpdate.setProduct_id(1);
        ProductUpdate.setProduct_name("tobillera");
        ProductUpdate.setProduct_value(50000);
        ProductUpdate.setCategory_id(3);
        repository.saveObj(ProductUpdate);
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("==========  deleteObj ==========");
        repository.deleteObj(2);
        repository.listAllObj().forEach(System.out::println);

    }
}  // TestProductRepositoryImpl