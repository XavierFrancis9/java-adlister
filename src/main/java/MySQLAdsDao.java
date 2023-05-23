import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads{
    private Connection connection;
    public MySQLAdsDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(config.getUrl(), config.getUser(), config.getPassword());
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database!", e);
        }
    }
    @Override
    public List<Ad> all() {
        try {
            Statement stmt = connection.createStatement();

            String selectAds = "SELECT * FROM ads";

            ResultSet rs = stmt.executeQuery(selectAds);
            List<Ad> ads = new ArrayList<>();

            // add ad to list as long as there is one to add
            while(rs.next()) {
                ads.add(new Ad(rs.getLong("id"), rs.getLong("user_id"), rs.getString("title"), rs.getString("description")));

            }
            // return ads list
            return ads;


        } catch(Exception e) {
            throw new RuntimeException("Error creating statement.");
        }
    }

    @Override
    public Long insert(Ad ad) {
        try {
            Statement stmt = connection.createStatement();

            String insertAd = String.format("INSERT INTO ads(user_id, title, description) VALUES('%s','%s','%s')", ad.getUserId(), ad.getTitle(), ad.getDescription());

            // execute query and generate primary key  id
            stmt.executeUpdate(insertAd, Statement.RETURN_GENERATED_KEYS);

            //access the add by the generated id
            ResultSet rs = stmt.getGeneratedKeys();
            rs.next();

            // return the new ad by accessing the first column
            return rs.getLong(1);
            
        } catch (Exception e) {
            throw new RuntimeException("Error creating statement.");
        }
    }
}

