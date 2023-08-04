package repository;

import models.Client;

import java.util.ArrayList;

public class ClientRepository  extends  Repository implements IClientRepository{

    /**
     * @param numero 
     * @return
     */
    @Override
    public Client find(String numero) {
        return null;
    }

    /**
     * @param client 
     * @return
     */
    @Override
    public int create(Client client) {
        //super.executeUpdate("INSERT INTO clients values ? , ? , ?");

        return 0;
    }

    /**
     * @param client 
     * @return
     */
    @Override
    public int update(Client client) {
        return 0;
    }

    /**
     * @param client 
     * @return
     */
    @Override
    public int delete(Client client) {
        return 0;
    }

    /**
     * @return 
     */
    @Override
    public ArrayList<Client> all() {
        return null;
    }
}
