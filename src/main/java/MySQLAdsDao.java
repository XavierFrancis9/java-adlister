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

            while(rs.next()) {
                ads.add(new Ad(rs.getLong("id"), rs.getLong("userId"), rs.getString("title"), rs.getString("description")));
            }

            return ads;


        } catch(Exception e) {
            throw new RuntimeException("Error creating statement.");
        }
    }

    @Override
    public Long insert(Ad ad) {
        try {
            Statement stmt = connection.createStatement();

            String insertAd = String.format("INSERT INTO national_parks(name, description, location) VALUES('%s','%s','%s')", ad.getId(), ad.getTitle(), ad.getDescription());

            stmt.executeUpdate(insertAd, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = stmt.getGeneratedKeys();
            rs.next();

            return rs.getLong(1);
            
        } catch (SQLException e) {
            throw new RuntimeException("Error creating statement.");
        }
    }
}

//   @Override
//    public Long insert(Ad ad) {
//        try {
//            Statement stmt = connection.createStatement();
//            stmt.executeUpdate(createInsertQuery(ad), Statement.RETURN_GENERATED_KEYS);
//            ResultSet rs = stmt.getGeneratedKeys();
//            rs.next();
//            return rs.getLong(1);
//        } catch (SQLException e) {
//            throw new RuntimeException("Error creating a new ad.", e);
//        }
//    }
//
//    private String createInsertQuery(Ad ad) {
//        return "INSERT INTO ads(user_id, title, description) VALUES "
//            + "(" + ad.getUserId() + ", "
//            + "'" + ad.getTitle() +"', "
//            + "'" + ad.getDescription() + "')";
//    }
