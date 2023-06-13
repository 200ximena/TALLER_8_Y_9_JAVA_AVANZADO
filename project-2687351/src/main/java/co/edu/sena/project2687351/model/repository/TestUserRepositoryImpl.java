package co.edu.sena.project2687351.model.repository;

import co.edu.sena.project2687351.model.User;

import java.sql.SQLException;

public class TestUserRepositoryImpl {

    public static  void main(String[] args) throws SQLException{
        Repository<User> repository = new UserRepositoryImpl();

        System.out.println("==========  saveObj Insert ==========");  //  insert
        User userInsert = new User();
        userInsert.setUser_firstname("dilan");
        userInsert.setUser_lastname("rojas");
        userInsert.setUser_email("dilan@lll.com");
        userInsert.setUser_password("asdf266171");
        repository.saveObj(userInsert);
        userInsert.setUser_firstname("lina");
        userInsert.setUser_lastname("rangel");
        userInsert.setUser_email("RANGEL@correo.com");
        userInsert.setUser_password("67890qwei");
        repository.saveObj(userInsert);
        userInsert.setUser_firstname("maria");
        userInsert.setUser_lastname("rojas");
        userInsert.setUser_email("lopkde@correo.com");
        userInsert.setUser_password("992920qwei");
        repository.saveObj(userInsert);

        System.out.println("==========  listAllObj ==========");
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("==========  byIdObj ==========");
        System.out.println(repository.byIdObj(1));
        System.out.println();

        System.out.println("==========  saveObj =========="); // update
        User userUpdate = new User();
        userUpdate.setUser_id(2);
        userUpdate.setUser_firstname("jorge");
        userUpdate.setUser_lastname("palacios");
        userUpdate.setUser_email("jorge@gmail.com");
        userUpdate.setUser_password("12345asdfg");
        repository.saveObj(userUpdate);
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("==========  deleteObj ==========");
        repository.deleteObj(2);
        repository.listAllObj().forEach(System.out::println);

    }
}  // TestUserRepositoryImpl
