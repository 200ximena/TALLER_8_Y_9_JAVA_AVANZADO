package co.edu.sena.project2687351.model.repository;
import co.edu.sena.project2687351.model.Categories;
import co.edu.sena.project2687351.util.ConnectionPool;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoryRepositoryImpl implements Repository<Categories> {
    private String sql = null;
    @Override
    public List<Categories> listAllObj() throws SQLException {
        sql = "select c.category_id, c.category_name " +
                " from categories c order by c.category_name ";
        List<Categories> category = new ArrayList<>();
        try (Connection conn = ConnectionPool.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)){
            while (rs.next()){
                Categories c = createObj(rs);
                category.add(c);
            } // while
        }// try
        return category;
    }// listAllObj


    @Override
    public Categories byIdObj(Integer id) throws SQLException {
        sql = "select c.category_id, c.category_name " +
                " from categories c where  c.category_id = ?";
        Categories category = null;

        try (Connection conn = ConnectionPool.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    category = createObj(rs);
                }
            }
        } // try
        return category;
    } // byIdObj


    @Override
    public Integer saveObj(Categories category) throws SQLException {
        int rowsAffected = 0;

        if (category.getCategory_id() != null && category.getCategory_id() >0) {
            sql = "update categories set category_name = ? " +
                    " where category_id = ?";
        } else {
            sql = "insert into categories (category_name)" +
                    " values(upper(?)) ";
        }

        try (Connection conn = ConnectionPool.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, category.getCategory_name());

            if (category.getCategory_id() != null && category.getCategory_id() >0) {
                ps.setInt(2, category.getCategory_id()) ;
            }

            rowsAffected = ps.executeUpdate();
        }
        return rowsAffected;
    } // saveObj

    @Override
    public void deleteObj(Integer id) throws SQLException {
        sql = "delete from categories where category_id = ?";
        try (Connection conn = ConnectionPool.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        }// try
    } // deleteObj

    @Override
    public Categories createObj(ResultSet rs) throws SQLException {
        Categories categories = new Categories();
        categories.setCategory_id(rs.getInt("category_id"));
        categories.setCategory_name(rs.getString("category_name"));
        return categories;
    }

}  // UserRepositoryImpl


