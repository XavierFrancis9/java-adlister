import java.sql.Connection;
import java.util.List;

public class MySQLDao implements AdsDao{
    private Connection connection;

    public MySQLDao(Config config) {

    }
    @Override
    public List<Ad> all() {
        return null;
    }

    @Override
    public Long insert(Ad ad) {
        return null;
    }
}
