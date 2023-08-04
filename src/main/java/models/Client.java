package models;

import java.util.ArrayList;

public class Client implements  IClient{
    private ArrayList<Compte>comptes;
    private long id;
    private  String prenom;
    private  String nom;

    private  String cni;

    public  Client(){
        this.comptes=new ArrayList<>();
    }
    public Client(long id, String prenom, String nom, String cni)
    {
        this();
        this.id=id;
        this.prenom=prenom;
        this.cni=cni;
    }

    public ArrayList<Compte> getComptes() {
        return comptes;
    }

    public  Client(Client client){
        this(client.getId(), client.getNom(),client.getNom(), client.getCni());
        this.comptes=client.getComptes();

    }
    public long getId() {
        return id;
    }

    public String getCni() {
        return cni;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

}
