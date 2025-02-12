import java.sql.*;
public class Bdd {
    //Attribut paramètre BDD
    //Connexion à la BDD
    private static Connection connexion;

    static {
        try {
            connexion = DriverManager.getConnection(Env.DB_URL, Env.DB_LOGIN, Env.DB_PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
