package repository;

import models.Client;
import models.Compte;

import java.sql.SQLException;

public interface ICompteRepository {
    public int create(Compte co) throws SQLException;
    public  Compte findCompte(String type);
    public  Compte findCompte(Client client);
    public  int saveTransaction();

}
