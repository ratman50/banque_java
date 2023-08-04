package repository;

import models.Client;

import java.util.ArrayList;

public interface IClientRepository {
    public Client find(String numero);
    public  int create(Client client);

    public  int update(Client client);

    public  int delete(Client client);

    public ArrayList<Client> all();
}
