package lab11.singleton.pseudocode;

public class Database {

    private static Database instance;

    private Database() {

    }

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public String query(String sql) {
        return sql;
    }
}
